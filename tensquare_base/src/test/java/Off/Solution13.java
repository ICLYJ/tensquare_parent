package Off;

import java.util.LinkedList;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/3/29 14:57
 *
 * 每天一道剑指offer-孩子们的游戏(圆圈中最后剩下的数)
 */
public class Solution13 {

    /**
     * 题目描述
     *
     * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
     * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。
     * 然后,他随机指定一个数m,让编号为0的小朋友开始报数。
     * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,
     * 并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
     * 可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
     * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
     */

    /**
     * 思路
     *
     * Java实现的话，可以使用LinkedList，考虑删除节点的效率。
     * 模拟游戏过程即可：其实这是个约瑟夫环问题，但是绝对没必要去死记硬背数学公式，
     * 直接用链表模拟游戏过程即可。
     */

    public int LastRemaining_Solution(int n,int m){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        int a = 0;
        while (list.size() > 1){
            a = (a + m -1) % list.size();
            list.remove(a); //每次删除，直到留下最后的那个
        }
        if (list.size() == 1){
            return list.get(0); //如果是最后一个则返回
        }
        return -1;
    }
}
