// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public final class Class2
{

    public Class2(int i)
    {
//        aBoolean41 = false;	// Removed due to it not being used anywhere except being set 4/18/17
//        anInt42 = -589;	// Removed due to it not being used anywhere except being set 4/18/17
        aClass30_Sub2_43 = new Class30_Sub2();
        if(i != 0)
//            anInt42 = -25;	// Removed due to it not being used anywhere except being set 4/18/17
        aClass30_Sub2_43.aClass30_Sub2_1303 = aClass30_Sub2_43;
        aClass30_Sub2_43.aClass30_Sub2_1304 = aClass30_Sub2_43;
    }

    public void method150(Class30_Sub2 class30_sub2)
    {
        if(class30_sub2.aClass30_Sub2_1304 != null)
            class30_sub2.method330();
        class30_sub2.aClass30_Sub2_1304 = aClass30_Sub2_43.aClass30_Sub2_1304;
        class30_sub2.aClass30_Sub2_1303 = aClass30_Sub2_43;
        class30_sub2.aClass30_Sub2_1304.aClass30_Sub2_1303 = class30_sub2;
        class30_sub2.aClass30_Sub2_1303.aClass30_Sub2_1304 = class30_sub2;
    }

    public Class30_Sub2 method151()
    {
        Class30_Sub2 class30_sub2 = aClass30_Sub2_43.aClass30_Sub2_1303;
        if(class30_sub2 == aClass30_Sub2_43)
        {
            return null;
        } else
        {
            class30_sub2.method330();
            return class30_sub2;
        }
    }

    public Class30_Sub2 method152()
    {
        Class30_Sub2 class30_sub2 = aClass30_Sub2_43.aClass30_Sub2_1303;
        if(class30_sub2 == aClass30_Sub2_43)
        {
            aClass30_Sub2_44 = null;
            return null;
        } else
        {
            aClass30_Sub2_44 = class30_sub2.aClass30_Sub2_1303;
            return class30_sub2;
        }
    }

    public Class30_Sub2 method153(boolean flag)
    {
        if(flag)
            throw new NullPointerException();
        Class30_Sub2 class30_sub2 = aClass30_Sub2_44;
        if(class30_sub2 == aClass30_Sub2_43)
        {
            aClass30_Sub2_44 = null;
            return null;
        } else
        {
            aClass30_Sub2_44 = class30_sub2.aClass30_Sub2_1303;
            return class30_sub2;
        }
    }

    public int method154()
    {
        int i = 0;
        for(Class30_Sub2 class30_sub2 = aClass30_Sub2_43.aClass30_Sub2_1303; class30_sub2 != aClass30_Sub2_43; class30_sub2 = class30_sub2.aClass30_Sub2_1303)
            i++;

        return i;
    }

//    private boolean aBoolean41;	//Said its not used 4/18/17
//    private int anInt42;	//Said its not used 4/18/17
    public Class30_Sub2 aClass30_Sub2_43;
    private Class30_Sub2 aClass30_Sub2_44;
}
