// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.PrintStream;
import sign.signlink;

public class Class37
{

    public static void method533(int i, Class44 class44)
    {
        if(i != 0)
            anInt644 = 91;
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("varbit.dat", null), 891);
        anInt645 = class30_sub2_sub2.method410();
        if(aClass37Array646 == null)
            aClass37Array646 = new Class37[anInt645];
        for(int j = 0; j < anInt645; j++)
        {
            if(aClass37Array646[j] == null)
                aClass37Array646[j] = new Class37();
            aClass37Array646[j].method534(class30_sub2_sub2, false, j);
            if(aClass37Array646[j].aBoolean651)
                Class41.aClass41Array701[aClass37Array646[j].anInt648].aBoolean713 = true;
        }

        if(class30_sub2_sub2.anInt1406 != class30_sub2_sub2.aByteArray1405.length)
            System.out.println("varbit load mismatch");
    }

    public void method534(Class30_Sub2_Sub2 class30_sub2_sub2, boolean flag, int i)
    {
        if(flag)
            return;
        do
        {
            int j = class30_sub2_sub2.method408();
            if(j == 0)
                return;
            if(j == 1)
            {
                anInt648 = class30_sub2_sub2.method410();
                anInt649 = class30_sub2_sub2.method408();
                anInt650 = class30_sub2_sub2.method408();
            } else
            if(j == 10)
                aString647 = class30_sub2_sub2.method415();
            else
            if(j == 2)
                aBoolean651 = true;
            else
            if(j == 3)
                anInt652 = class30_sub2_sub2.method413();
            else
            if(j == 4)
                anInt653 = class30_sub2_sub2.method413();
            else
                System.out.println("Error unrecognised config code: " + j);
        } while(true);
    }

    public Class37()
    {
        aBoolean651 = false;
        anInt652 = -1;
    }

    private static int anInt644;
    public static int anInt645;
    public static Class37 aClass37Array646[];
    public String aString647;
    public int anInt648;
    public int anInt649;
    public int anInt650;
    public boolean aBoolean651;
    public int anInt652;
    public int anInt653;
}
