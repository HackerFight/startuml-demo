package com.qiuguan.test;

/**
 * @author qiuguan
 * @date 2022/10/17 23:44:38  星期一
 */
public class Test {

    public static void main(String[] args) {

        String str = "伴随着移动互联网的高速普及，我们的娱乐重心大部分都转移到手机上。微博，B站，抖音，直播等等一系列的视频网站给我们带来了极大的欢乐和满足。很多时候下班回家，做饭吃饭，打扫卫生，洗澡洗漱后发现已经半夜11点了，于是赶紧关灯上床，打开手机，欢快的刷一刷视频网站，仿佛这一天的疲惫都在这一刻得到了放松。\n" +
                "        不知道小伙伴们，是不是有时候刷着刷着眼睛就流泪了? 或者觉得眼干眼涩，然后用力的揉一揉? 甚至会出现酸胀刺痛和灼烧感？没错，这些都是在黑暗中玩手机带来的直观感受，今天我们就来分析下关灯玩手机对眼睛都有哪些危害?\n" +
                "￼\n" +
                "\n" +
                "危害一：损伤黄斑区\n" +
                "黄斑区是视力最敏锐的地方，所以一旦黄斑区发生了病变，就会导致视力下降，视物变形。长期的强光刺激，是黄斑区损伤的关键因素；关灯后，手机屏幕的强光在黑暗环境中特别刺眼，并且我们看手机的距离比较近，这就导致手机屏幕的强光直射眼睛，久而久之，就会引发黄斑区损伤。\n" +
                "￼\n" +
                "\n" +
                "危害二：损伤眼表泪膜引发干眼症\n" +
                "正常情况下，人每分钟眨眼为15~20次，但是当玩手机的时候，由于注意力比较集中(是不是比上课听讲要集中…O(∩_∩)O), 每分钟眨眼的次数将会大幅下降，在加上黑暗中的强光直射，这会导致泪液分泌减少，甚至还会导致角膜上皮脱落，一旦出现泪膜不稳定或角膜上皮损伤，就会导致”干眼症”。干眼症典型的症状就是眼疲劳，眼睛干涩，畏光流泪，眼睛发红，严重的话还会出现眼睛酸胀刺痛，乃至烧灼感。前面我有说到，很多时候我们刷着刷着眼睛会流泪，或者干涩，这就是干眼症带来的危害。\n" +
                "￼\n" +
                "\n" +
                "危害三：容易引发青光眼\n" +
                "在黑暗中强光刺激下玩手机，就会导致瞳孔长时间散大，不利于房水的循环；晶状体变凸，眼睛的肌肉会持续的紧张，将会导致眼压升高，由此会引发青光眼。（这种情况一般常见于眼睛本身结构存在缺陷的群体，比如浅前房、小眼球等人群），甚至会造成不可逆的神经损伤，引起永久失明。\n" +
                "￼\n" +
                "是不是一直觉得”青光眼“是老年人才会得的眼病，其实并不然，年轻人不能正确用眼(譬如关灯玩手机) 都会引发青光眼，而青光眼又是一种不可逆的致盲眼病，所以一定要引起我们的特别关注。\n" +
                "\n" +
                "\n" +
                "当我们在黑夜中刷着手机玩的不亦乐乎的时候，殊不知我们的眼睛在负重前行，久而久之，眼睛就会出现不可逆的损害。所以，从现在起，要学会爱护我们的眼睛。\n" +
                "\n" +
                "\n" +
                "护眼的小建议\n" +
                " 1.定时闭眼休息和眺望远方，尤其长时间对着电脑，手机的小伙伴，更要学会放松自己的眼睛\n" +
                " 2.热毛巾敷眼，改善眼部的血液循环，缓解疲劳和不适\n" +
                " 3.做眼保健操";

        String s = str.replaceAll(" ", "");
        String s1 = s.replaceAll("\\n", "");
        System.out.println("s1 = " + s1.length());
    }
}
