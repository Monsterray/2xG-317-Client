// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public class Class30_Sub2_Sub4_Sub6 extends Class30_Sub2_Sub4
{

    public static void method458(int i)
    {
        aClass21Array1661 = null;
        aBooleanArray1663 = null;
        aBooleanArray1664 = null;
        for(anIntArray1665 = null; i >= 0;)
            return;

        anIntArray1666 = null;
        anIntArray1667 = null;
        anIntArray1668 = null;
        anIntArray1669 = null;
        anIntArray1670 = null;
        anIntArray1671 = null;
        anIntArrayArray1672 = null;
        anIntArray1673 = null;
        anIntArrayArray1674 = null;
        anIntArray1675 = null;
        anIntArray1676 = null;
        anIntArray1677 = null;
        anIntArray1689 = null;
        anIntArray1690 = null;
        anIntArray1691 = null;
        anIntArray1692 = null;
    }

    public static void method459(int i, Class42 class42)
    {
        aClass21Array1661 = new Class21[i+400000];
        aClass42_1662 = class42;
    }

    public static void method460(byte abyte0[], int i, int j)
    {
        if(abyte0 == null)
        {
            Class21 class21 = aClass21Array1661[j] = new Class21();
            class21.anInt369 = 0;
            class21.anInt370 = 0;
            class21.anInt371 = 0;
            return;
        }
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(abyte0, 891);
        class30_sub2_sub2.anInt1406 = abyte0.length - 18;
        Class21 class21_1 = aClass21Array1661[j] = new Class21();
        class21_1.aByteArray368 = abyte0;
        class21_1.anInt369 = class30_sub2_sub2.method410();
        class21_1.anInt370 = class30_sub2_sub2.method410();
        class21_1.anInt371 = class30_sub2_sub2.method408();
        int k = class30_sub2_sub2.method408();
        int l = class30_sub2_sub2.method408();
        if(i != -4036)
            return;
        int i1 = class30_sub2_sub2.method408();
        int j1 = class30_sub2_sub2.method408();
        int k1 = class30_sub2_sub2.method408();
        int l1 = class30_sub2_sub2.method410();
        int i2 = class30_sub2_sub2.method410();
        int j2 = class30_sub2_sub2.method410();
        int k2 = class30_sub2_sub2.method410();
        int l2 = 0;
        class21_1.anInt372 = l2;
        l2 += class21_1.anInt369;
        class21_1.anInt378 = l2;
        l2 += class21_1.anInt370;
        class21_1.anInt381 = l2;
        if(l == 255)
            l2 += class21_1.anInt370;
        else
            class21_1.anInt381 = -l - 1;
        class21_1.anInt383 = l2;
        if(j1 == 1)
            l2 += class21_1.anInt370;
        else
            class21_1.anInt383 = -1;
        class21_1.anInt380 = l2;
        if(k == 1)
            l2 += class21_1.anInt370;
        else
            class21_1.anInt380 = -1;
        class21_1.anInt376 = l2;
        if(k1 == 1)
            l2 += class21_1.anInt369;
        else
            class21_1.anInt376 = -1;
        class21_1.anInt382 = l2;
        if(i1 == 1)
            l2 += class21_1.anInt370;
        else
            class21_1.anInt382 = -1;
        class21_1.anInt377 = l2;
        l2 += k2;
        class21_1.anInt379 = l2;
        l2 += class21_1.anInt370 * 2;
        class21_1.anInt384 = l2;
        l2 += class21_1.anInt371 * 6;
        class21_1.anInt373 = l2;
        l2 += l1;
        class21_1.anInt374 = l2;
        l2 += i2;
        class21_1.anInt375 = l2;
        l2 += j2;
    }

    public static void method461(int i, int j)
    {
        aClass21Array1661[j] = null;
        if(i <= 0){
//            anInt1619 = -219;	// Removed due to it not being used anywhere except being set 4/20/17
        }
    }

    public static Class30_Sub2_Sub4_Sub6 method462(int i, int j)
    {
        if(aClass21Array1661 == null)
            return null;
        Class21 class21 = aClass21Array1661[j];
        if(i != 9)
        {
            for(int k = 1; k > 0; k++);
        }
        if(class21 == null)
        {
//            aClass42_1662.method548(j);	//REMOVED Method did completely nothing
            return null;
        } else
        {
            return new Class30_Sub2_Sub4_Sub6(j, -870);
        }
    }

    public static boolean method463(int i)
    {
        if(aClass21Array1661 == null)
            return false;
        Class21 class21 = aClass21Array1661[i];
        if(class21 == null)
        {
//            aClass42_1662.method548(i);	//REMOVED Method did completely nothing
            return false;
        } else
        {
            return true;
        }
    }

    private Class30_Sub2_Sub4_Sub6(boolean flag)
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        if(!flag)
            aBoolean1618 = !aBoolean1618;
    }

    private Class30_Sub2_Sub4_Sub6(int i, int j)
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        anInt1620++;
        Class21 class21 = aClass21Array1661[i];
        anInt1626 = class21.anInt369;
        anInt1630 = class21.anInt370;
        anInt1642 = class21.anInt371;
        anIntArray1627 = new int[anInt1626];
        anIntArray1628 = new int[anInt1626];
        anIntArray1629 = new int[anInt1626];
        anIntArray1631 = new int[anInt1630];
        anIntArray1632 = new int[anInt1630];
        while(j >= 0) 
            aBoolean1618 = !aBoolean1618;
        anIntArray1633 = new int[anInt1630];
        anIntArray1643 = new int[anInt1642];
        anIntArray1644 = new int[anInt1642];
        anIntArray1645 = new int[anInt1642];
        if(class21.anInt376 >= 0)
            anIntArray1655 = new int[anInt1626];
        if(class21.anInt380 >= 0)
            anIntArray1637 = new int[anInt1630];
        if(class21.anInt381 >= 0)
            anIntArray1638 = new int[anInt1630];
        else
            anInt1641 = -class21.anInt381 - 1;
        if(class21.anInt382 >= 0)
            anIntArray1639 = new int[anInt1630];
        if(class21.anInt383 >= 0)
            anIntArray1656 = new int[anInt1630];
        anIntArray1640 = new int[anInt1630];
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class21.aByteArray368, 891);
        class30_sub2_sub2.anInt1406 = class21.anInt372;
        Class30_Sub2_Sub2 class30_sub2_sub2_1 = new Class30_Sub2_Sub2(class21.aByteArray368, 891);
        class30_sub2_sub2_1.anInt1406 = class21.anInt373;
        Class30_Sub2_Sub2 class30_sub2_sub2_2 = new Class30_Sub2_Sub2(class21.aByteArray368, 891);
        class30_sub2_sub2_2.anInt1406 = class21.anInt374;
        Class30_Sub2_Sub2 class30_sub2_sub2_3 = new Class30_Sub2_Sub2(class21.aByteArray368, 891);
        class30_sub2_sub2_3.anInt1406 = class21.anInt375;
        Class30_Sub2_Sub2 class30_sub2_sub2_4 = new Class30_Sub2_Sub2(class21.aByteArray368, 891);
        class30_sub2_sub2_4.anInt1406 = class21.anInt376;
        int k = 0;
        int l = 0;
        int i1 = 0;
        for(int j1 = 0; j1 < anInt1626; j1++)
        {
            int k1 = class30_sub2_sub2.method408();
            int i2 = 0;
            if((k1 & 1) != 0)
                i2 = class30_sub2_sub2_1.method421();
            int k2 = 0;
            if((k1 & 2) != 0)
                k2 = class30_sub2_sub2_2.method421();
            int i3 = 0;
            if((k1 & 4) != 0)
                i3 = class30_sub2_sub2_3.method421();
            anIntArray1627[j1] = k + i2;
            anIntArray1628[j1] = l + k2;
            anIntArray1629[j1] = i1 + i3;
            k = anIntArray1627[j1];
            l = anIntArray1628[j1];
            i1 = anIntArray1629[j1];
            if(anIntArray1655 != null)
                anIntArray1655[j1] = class30_sub2_sub2_4.method408();
        }

        class30_sub2_sub2.anInt1406 = class21.anInt379;
        class30_sub2_sub2_1.anInt1406 = class21.anInt380;
        class30_sub2_sub2_2.anInt1406 = class21.anInt381;
        class30_sub2_sub2_3.anInt1406 = class21.anInt382;
        class30_sub2_sub2_4.anInt1406 = class21.anInt383;
        for(int l1 = 0; l1 < anInt1630; l1++)
        {
            anIntArray1640[l1] = class30_sub2_sub2.method410();
            if(anIntArray1637 != null)
                anIntArray1637[l1] = class30_sub2_sub2_1.method408();
            if(anIntArray1638 != null)
                anIntArray1638[l1] = class30_sub2_sub2_2.method408();
            if(anIntArray1639 != null)
                anIntArray1639[l1] = class30_sub2_sub2_3.method408();
            if(anIntArray1656 != null)
                anIntArray1656[l1] = class30_sub2_sub2_4.method408();
        }

        class30_sub2_sub2.anInt1406 = class21.anInt377;
        class30_sub2_sub2_1.anInt1406 = class21.anInt378;
        int j2 = 0;
        int l2 = 0;
        int j3 = 0;
        int k3 = 0;
        for(int l3 = 0; l3 < anInt1630; l3++)
        {
            int i4 = class30_sub2_sub2_1.method408();
            if(i4 == 1)
            {
                j2 = class30_sub2_sub2.method421() + k3;
                k3 = j2;
                l2 = class30_sub2_sub2.method421() + k3;
                k3 = l2;
                j3 = class30_sub2_sub2.method421() + k3;
                k3 = j3;
                anIntArray1631[l3] = j2;
                anIntArray1632[l3] = l2;
                anIntArray1633[l3] = j3;
            }
            if(i4 == 2)
            {
//                j2 = j2;	//REMOVED action is pointless 4/20/17
                l2 = j3;
                j3 = class30_sub2_sub2.method421() + k3;
                k3 = j3;
                anIntArray1631[l3] = j2;
                anIntArray1632[l3] = l2;
                anIntArray1633[l3] = j3;
            }
            if(i4 == 3)
            {
                j2 = j3;
//                l2 = l2;	//REMOVED action is pointless 4/20/17
                j3 = class30_sub2_sub2.method421() + k3;
                k3 = j3;
                anIntArray1631[l3] = j2;
                anIntArray1632[l3] = l2;
                anIntArray1633[l3] = j3;
            }
            if(i4 == 4)
            {
                int k4 = j2;
                j2 = l2;
                l2 = k4;
                j3 = class30_sub2_sub2.method421() + k3;
                k3 = j3;
                anIntArray1631[l3] = j2;
                anIntArray1632[l3] = l2;
                anIntArray1633[l3] = j3;
            }
        }

        class30_sub2_sub2.anInt1406 = class21.anInt384;
        for(int j4 = 0; j4 < anInt1642; j4++)
        {
            anIntArray1643[j4] = class30_sub2_sub2.method410();
            anIntArray1644[j4] = class30_sub2_sub2.method410();
            anIntArray1645[j4] = class30_sub2_sub2.method410();
        }

    }

    public Class30_Sub2_Sub4_Sub6(int i, Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[], int j)
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        anInt1620++;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        anInt1626 = 0;
        anInt1630 = 0;
        anInt1642 = 0;
        anInt1641 = -1;
        for(int k = 0; k < i; k++)
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[k];
            if(class30_sub2_sub4_sub6 != null)
            {
                anInt1626 += class30_sub2_sub4_sub6.anInt1626;
                anInt1630 += class30_sub2_sub4_sub6.anInt1630;
                anInt1642 += class30_sub2_sub4_sub6.anInt1642;
                flag |= class30_sub2_sub4_sub6.anIntArray1637 != null;
                if(class30_sub2_sub4_sub6.anIntArray1638 != null)
                {
                    flag1 = true;
                } else
                {
                    if(anInt1641 == -1)
                        anInt1641 = class30_sub2_sub4_sub6.anInt1641;
                    if(anInt1641 != class30_sub2_sub4_sub6.anInt1641)
                        flag1 = true;
                }
                flag2 |= class30_sub2_sub4_sub6.anIntArray1639 != null;
                flag3 |= class30_sub2_sub4_sub6.anIntArray1656 != null;
            }
        }

        anIntArray1627 = new int[anInt1626];
        anIntArray1628 = new int[anInt1626];
        anIntArray1629 = new int[anInt1626];
        anIntArray1655 = new int[anInt1626];
        anIntArray1631 = new int[anInt1630];
        anIntArray1632 = new int[anInt1630];
        anIntArray1633 = new int[anInt1630];
        anIntArray1643 = new int[anInt1642];
        anIntArray1644 = new int[anInt1642];
        anIntArray1645 = new int[anInt1642];
        if(flag)
            anIntArray1637 = new int[anInt1630];
        if(flag1)
            anIntArray1638 = new int[anInt1630];
        if(flag2)
            anIntArray1639 = new int[anInt1630];
        if(flag3)
            anIntArray1656 = new int[anInt1630];
        anIntArray1640 = new int[anInt1630];
        anInt1626 = 0;
        anInt1630 = 0;
        anInt1642 = 0;
        if(j >= 0){
//            anInt1619 = 23;	// Removed due to it not being used anywhere except being set 4/20/17
        }
        int l = 0;
        for(int i1 = 0; i1 < i; i1++)
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = aclass30_sub2_sub4_sub6[i1];
            if(class30_sub2_sub4_sub6_1 != null)
            {
                for(int j1 = 0; j1 < class30_sub2_sub4_sub6_1.anInt1630; j1++)
                {
                    if(flag)
                        if(class30_sub2_sub4_sub6_1.anIntArray1637 == null)
                        {
                            anIntArray1637[anInt1630] = 0;
                        } else
                        {
                            int k1 = class30_sub2_sub4_sub6_1.anIntArray1637[j1];
                            if((k1 & 2) == 2)
                                k1 += l << 2;
                            anIntArray1637[anInt1630] = k1;
                        }
                    if(flag1)
                        if(class30_sub2_sub4_sub6_1.anIntArray1638 == null)
                            anIntArray1638[anInt1630] = class30_sub2_sub4_sub6_1.anInt1641;
                        else
                            anIntArray1638[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1638[j1];
                    if(flag2)
                        if(class30_sub2_sub4_sub6_1.anIntArray1639 == null)
                            anIntArray1639[anInt1630] = 0;
                        else
                            anIntArray1639[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1639[j1];
                    if(flag3 && class30_sub2_sub4_sub6_1.anIntArray1656 != null)
                        anIntArray1656[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1656[j1];
                    anIntArray1640[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1640[j1];
                    anIntArray1631[anInt1630] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1631[j1]);
                    anIntArray1632[anInt1630] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1632[j1]);
                    anIntArray1633[anInt1630] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1633[j1]);
                    anInt1630++;
                }

                for(int l1 = 0; l1 < class30_sub2_sub4_sub6_1.anInt1642; l1++)
                {
                    anIntArray1643[anInt1642] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1643[l1]);
                    anIntArray1644[anInt1642] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1644[l1]);
                    anIntArray1645[anInt1642] = method465(class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_1.anIntArray1645[l1]);
                    anInt1642++;
                }

                l += class30_sub2_sub4_sub6_1.anInt1642;
            }
        }

    }

    public Class30_Sub2_Sub4_Sub6(int i, int j, boolean flag, Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[])
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        anInt1620++;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        anInt1626 = 0;
        anInt1630 = 0;
        anInt1642 = 0;
        anInt1641 = -1;
        for(int k = 0; k < i; k++)
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[k];
            if(class30_sub2_sub4_sub6 != null)
            {
                anInt1626 += class30_sub2_sub4_sub6.anInt1626;
                anInt1630 += class30_sub2_sub4_sub6.anInt1630;
                anInt1642 += class30_sub2_sub4_sub6.anInt1642;
                flag1 |= class30_sub2_sub4_sub6.anIntArray1637 != null;
                if(class30_sub2_sub4_sub6.anIntArray1638 != null)
                {
                    flag2 = true;
                } else
                {
                    if(anInt1641 == -1)
                        anInt1641 = class30_sub2_sub4_sub6.anInt1641;
                    if(anInt1641 != class30_sub2_sub4_sub6.anInt1641)
                        flag2 = true;
                }
                flag3 |= class30_sub2_sub4_sub6.anIntArray1639 != null;
                flag4 |= class30_sub2_sub4_sub6.anIntArray1640 != null;
            }
        }

        anIntArray1627 = new int[anInt1626];
        anIntArray1628 = new int[anInt1626];
        anIntArray1629 = new int[anInt1626];
        anIntArray1631 = new int[anInt1630];
        anIntArray1632 = new int[anInt1630];
        anIntArray1633 = new int[anInt1630];
        anIntArray1634 = new int[anInt1630];
        anIntArray1635 = new int[anInt1630];
        anIntArray1636 = new int[anInt1630];
        anIntArray1643 = new int[anInt1642];
        anIntArray1644 = new int[anInt1642];
        anIntArray1645 = new int[anInt1642];
        if(j >= 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(flag1)
            anIntArray1637 = new int[anInt1630];
        if(flag2)
            anIntArray1638 = new int[anInt1630];
        if(flag3)
            anIntArray1639 = new int[anInt1630];
        if(flag4)
            anIntArray1640 = new int[anInt1630];
        anInt1626 = 0;
        anInt1630 = 0;
        anInt1642 = 0;
        int i1 = 0;
        for(int j1 = 0; j1 < i; j1++)
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = aclass30_sub2_sub4_sub6[j1];
            if(class30_sub2_sub4_sub6_1 != null)
            {
                int k1 = anInt1626;
                for(int l1 = 0; l1 < class30_sub2_sub4_sub6_1.anInt1626; l1++)
                {
                    anIntArray1627[anInt1626] = class30_sub2_sub4_sub6_1.anIntArray1627[l1];
                    anIntArray1628[anInt1626] = class30_sub2_sub4_sub6_1.anIntArray1628[l1];
                    anIntArray1629[anInt1626] = class30_sub2_sub4_sub6_1.anIntArray1629[l1];
                    anInt1626++;
                }

                for(int i2 = 0; i2 < class30_sub2_sub4_sub6_1.anInt1630; i2++)
                {
                    anIntArray1631[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1631[i2] + k1;
                    anIntArray1632[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1632[i2] + k1;
                    anIntArray1633[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1633[i2] + k1;
                    anIntArray1634[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1634[i2];
                    anIntArray1635[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1635[i2];
                    anIntArray1636[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1636[i2];
                    if(flag1)
                        if(class30_sub2_sub4_sub6_1.anIntArray1637 == null)
                        {
                            anIntArray1637[anInt1630] = 0;
                        } else
                        {
                            int j2 = class30_sub2_sub4_sub6_1.anIntArray1637[i2];
                            if((j2 & 2) == 2)
                                j2 += i1 << 2;
                            anIntArray1637[anInt1630] = j2;
                        }
                    if(flag2)
                        if(class30_sub2_sub4_sub6_1.anIntArray1638 == null)
                            anIntArray1638[anInt1630] = class30_sub2_sub4_sub6_1.anInt1641;
                        else
                            anIntArray1638[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1638[i2];
                    if(flag3)
                        if(class30_sub2_sub4_sub6_1.anIntArray1639 == null)
                            anIntArray1639[anInt1630] = 0;
                        else
                            anIntArray1639[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1639[i2];
                    if(flag4 && class30_sub2_sub4_sub6_1.anIntArray1640 != null)
                        anIntArray1640[anInt1630] = class30_sub2_sub4_sub6_1.anIntArray1640[i2];
                    anInt1630++;
                }

                for(int k2 = 0; k2 < class30_sub2_sub4_sub6_1.anInt1642; k2++)
                {
                    anIntArray1643[anInt1642] = class30_sub2_sub4_sub6_1.anIntArray1643[k2] + k1;
                    anIntArray1644[anInt1642] = class30_sub2_sub4_sub6_1.anIntArray1644[k2] + k1;
                    anIntArray1645[anInt1642] = class30_sub2_sub4_sub6_1.anIntArray1645[k2] + k1;
                    anInt1642++;
                }

                i1 += class30_sub2_sub4_sub6_1.anInt1642;
            }
        }

        method466(false);
    }

    public Class30_Sub2_Sub4_Sub6(int i, boolean flag, boolean flag1, boolean flag2, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6)
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        anInt1620++;
        anInt1626 = class30_sub2_sub4_sub6.anInt1626;
        anInt1630 = class30_sub2_sub4_sub6.anInt1630;
        anInt1642 = class30_sub2_sub4_sub6.anInt1642;
        if(flag2)
        {
            anIntArray1627 = class30_sub2_sub4_sub6.anIntArray1627;
            anIntArray1628 = class30_sub2_sub4_sub6.anIntArray1628;
            anIntArray1629 = class30_sub2_sub4_sub6.anIntArray1629;
        } else
        {
            anIntArray1627 = new int[anInt1626];
            anIntArray1628 = new int[anInt1626];
            anIntArray1629 = new int[anInt1626];
            for(int j = 0; j < anInt1626; j++)
            {
                anIntArray1627[j] = class30_sub2_sub4_sub6.anIntArray1627[j];
                anIntArray1628[j] = class30_sub2_sub4_sub6.anIntArray1628[j];
                anIntArray1629[j] = class30_sub2_sub4_sub6.anIntArray1629[j];
            }

        }
        if(flag)
        {
            anIntArray1640 = class30_sub2_sub4_sub6.anIntArray1640;
        } else
        {
            anIntArray1640 = new int[anInt1630];
            for(int k = 0; k < anInt1630; k++)
                anIntArray1640[k] = class30_sub2_sub4_sub6.anIntArray1640[k];

        }
        if(flag1)
        {
            anIntArray1639 = class30_sub2_sub4_sub6.anIntArray1639;
        } else
        {
            anIntArray1639 = new int[anInt1630];
            if(class30_sub2_sub4_sub6.anIntArray1639 == null)
            {
                for(int l = 0; l < anInt1630; l++)
                    anIntArray1639[l] = 0;

            } else
            {
                for(int i1 = 0; i1 < anInt1630; i1++)
                    anIntArray1639[i1] = class30_sub2_sub4_sub6.anIntArray1639[i1];

            }
        }
        anIntArray1655 = class30_sub2_sub4_sub6.anIntArray1655;
        anIntArray1656 = class30_sub2_sub4_sub6.anIntArray1656;
        anIntArray1637 = class30_sub2_sub4_sub6.anIntArray1637;
        anIntArray1631 = class30_sub2_sub4_sub6.anIntArray1631;
        anIntArray1632 = class30_sub2_sub4_sub6.anIntArray1632;
        anIntArray1633 = class30_sub2_sub4_sub6.anIntArray1633;
        anIntArray1638 = class30_sub2_sub4_sub6.anIntArray1638;
        anInt1641 = class30_sub2_sub4_sub6.anInt1641;
        anIntArray1643 = class30_sub2_sub4_sub6.anIntArray1643;
        if(i < 9 || i > 9)
        {
            for(int j1 = 1; j1 > 0; j1++);
        }
        anIntArray1644 = class30_sub2_sub4_sub6.anIntArray1644;
        anIntArray1645 = class30_sub2_sub4_sub6.anIntArray1645;
    }

    public Class30_Sub2_Sub4_Sub6(boolean flag, int i, boolean flag1, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6)
    {
        anInt1614 = 9;
        aBoolean1615 = false;
//        anInt1616 = 360;	// Removed due to it not being used anywhere except being set 4/20/17
        anInt1617 = 1;
        aBoolean1618 = true;
        aBoolean1659 = false;
        anInt1620++;
        anInt1626 = class30_sub2_sub4_sub6.anInt1626;
        anInt1630 = class30_sub2_sub4_sub6.anInt1630;
        anInt1642 = class30_sub2_sub4_sub6.anInt1642;
        if(flag)
        {
            anIntArray1628 = new int[anInt1626];
            for(int j = 0; j < anInt1626; j++)
                anIntArray1628[j] = class30_sub2_sub4_sub6.anIntArray1628[j];

        } else
        {
            anIntArray1628 = class30_sub2_sub4_sub6.anIntArray1628;
        }
        if(flag1)
        {
            anIntArray1634 = new int[anInt1630];
            anIntArray1635 = new int[anInt1630];
            anIntArray1636 = new int[anInt1630];
            for(int k = 0; k < anInt1630; k++)
            {
                anIntArray1634[k] = class30_sub2_sub4_sub6.anIntArray1634[k];
                anIntArray1635[k] = class30_sub2_sub4_sub6.anIntArray1635[k];
                anIntArray1636[k] = class30_sub2_sub4_sub6.anIntArray1636[k];
            }

            anIntArray1637 = new int[anInt1630];
            if(class30_sub2_sub4_sub6.anIntArray1637 == null)
            {
                for(int l = 0; l < anInt1630; l++)
                    anIntArray1637[l] = 0;

            } else
            {
                for(int i1 = 0; i1 < anInt1630; i1++)
                    anIntArray1637[i1] = class30_sub2_sub4_sub6.anIntArray1637[i1];

            }
            super.aClass33Array1425 = new Class33[anInt1626];
            for(int j1 = 0; j1 < anInt1626; j1++)
            {
                Class33 class33 = super.aClass33Array1425[j1] = new Class33();
                Class33 class33_1 = ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6)).aClass33Array1425[j1];
                class33.anInt602 = class33_1.anInt602;
                class33.anInt603 = class33_1.anInt603;
                class33.anInt604 = class33_1.anInt604;
                class33.anInt605 = class33_1.anInt605;
            }

            aClass33Array1660 = class30_sub2_sub4_sub6.aClass33Array1660;
        } else
        {
            anIntArray1634 = class30_sub2_sub4_sub6.anIntArray1634;
            anIntArray1635 = class30_sub2_sub4_sub6.anIntArray1635;
            anIntArray1636 = class30_sub2_sub4_sub6.anIntArray1636;
            anIntArray1637 = class30_sub2_sub4_sub6.anIntArray1637;
        }
        anIntArray1627 = class30_sub2_sub4_sub6.anIntArray1627;
        anIntArray1629 = class30_sub2_sub4_sub6.anIntArray1629;
        anIntArray1640 = class30_sub2_sub4_sub6.anIntArray1640;
        anIntArray1639 = class30_sub2_sub4_sub6.anIntArray1639;
        anIntArray1638 = class30_sub2_sub4_sub6.anIntArray1638;
        anInt1641 = class30_sub2_sub4_sub6.anInt1641;
        anIntArray1631 = class30_sub2_sub4_sub6.anIntArray1631;
        anIntArray1632 = class30_sub2_sub4_sub6.anIntArray1632;
        anIntArray1633 = class30_sub2_sub4_sub6.anIntArray1633;
        anIntArray1643 = class30_sub2_sub4_sub6.anIntArray1643;
        anIntArray1644 = class30_sub2_sub4_sub6.anIntArray1644;
        anIntArray1645 = class30_sub2_sub4_sub6.anIntArray1645;
        super.anInt1426 = ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6)).anInt1426;
        for(anInt1651 = class30_sub2_sub4_sub6.anInt1651; i >= 0;)
            throw new NullPointerException();

        anInt1650 = class30_sub2_sub4_sub6.anInt1650;
        anInt1653 = class30_sub2_sub4_sub6.anInt1653;
        anInt1652 = class30_sub2_sub4_sub6.anInt1652;
        anInt1646 = class30_sub2_sub4_sub6.anInt1646;
        anInt1648 = class30_sub2_sub4_sub6.anInt1648;
        anInt1649 = class30_sub2_sub4_sub6.anInt1649;
        anInt1647 = class30_sub2_sub4_sub6.anInt1647;
    }

    public void method464(int i, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6, boolean flag)
    {
        anInt1626 = class30_sub2_sub4_sub6.anInt1626;
        if(i != 7)
        {
            for(int j = 1; j > 0; j++);
        }
        anInt1630 = class30_sub2_sub4_sub6.anInt1630;
        anInt1642 = class30_sub2_sub4_sub6.anInt1642;
        if(anIntArray1622.length < anInt1626)
        {
            anIntArray1622 = new int[anInt1626 + 100];
            anIntArray1623 = new int[anInt1626 + 100];
            anIntArray1624 = new int[anInt1626 + 100];
        }
        anIntArray1627 = anIntArray1622;
        anIntArray1628 = anIntArray1623;
        anIntArray1629 = anIntArray1624;
        for(int k = 0; k < anInt1626; k++)
        {
            anIntArray1627[k] = class30_sub2_sub4_sub6.anIntArray1627[k];
            anIntArray1628[k] = class30_sub2_sub4_sub6.anIntArray1628[k];
            anIntArray1629[k] = class30_sub2_sub4_sub6.anIntArray1629[k];
        }

        if(flag)
        {
            anIntArray1639 = class30_sub2_sub4_sub6.anIntArray1639;
        } else
        {
            if(anIntArray1625.length < anInt1630)
                anIntArray1625 = new int[anInt1630 + 100];
            anIntArray1639 = anIntArray1625;
            if(class30_sub2_sub4_sub6.anIntArray1639 == null)
            {
                for(int l = 0; l < anInt1630; l++)
                    anIntArray1639[l] = 0;

            } else
            {
                for(int i1 = 0; i1 < anInt1630; i1++)
                    anIntArray1639[i1] = class30_sub2_sub4_sub6.anIntArray1639[i1];

            }
        }
        anIntArray1637 = class30_sub2_sub4_sub6.anIntArray1637;
        anIntArray1640 = class30_sub2_sub4_sub6.anIntArray1640;
        anIntArray1638 = class30_sub2_sub4_sub6.anIntArray1638;
        anInt1641 = class30_sub2_sub4_sub6.anInt1641;
        anIntArrayArray1658 = class30_sub2_sub4_sub6.anIntArrayArray1658;
        anIntArrayArray1657 = class30_sub2_sub4_sub6.anIntArrayArray1657;
        anIntArray1631 = class30_sub2_sub4_sub6.anIntArray1631;
        anIntArray1632 = class30_sub2_sub4_sub6.anIntArray1632;
        anIntArray1633 = class30_sub2_sub4_sub6.anIntArray1633;
        anIntArray1634 = class30_sub2_sub4_sub6.anIntArray1634;
        anIntArray1635 = class30_sub2_sub4_sub6.anIntArray1635;
        anIntArray1636 = class30_sub2_sub4_sub6.anIntArray1636;
        anIntArray1643 = class30_sub2_sub4_sub6.anIntArray1643;
        anIntArray1644 = class30_sub2_sub4_sub6.anIntArray1644;
        anIntArray1645 = class30_sub2_sub4_sub6.anIntArray1645;
    }

    private final int method465(Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6, int i)
    {
        int j = -1;
        int k = class30_sub2_sub4_sub6.anIntArray1627[i];
        int l = class30_sub2_sub4_sub6.anIntArray1628[i];
        int i1 = class30_sub2_sub4_sub6.anIntArray1629[i];
        for(int j1 = 0; j1 < anInt1626; j1++)
        {
            if(k != anIntArray1627[j1] || l != anIntArray1628[j1] || i1 != anIntArray1629[j1])
                continue;
            j = j1;
            break;
        }

        if(j == -1)
        {
            anIntArray1627[anInt1626] = k;
            anIntArray1628[anInt1626] = l;
            anIntArray1629[anInt1626] = i1;
            if(class30_sub2_sub4_sub6.anIntArray1655 != null)
                anIntArray1655[anInt1626] = class30_sub2_sub4_sub6.anIntArray1655[i];
            j = anInt1626++;
        }
        return j;
    }

    public void method466(boolean flag)
    {
        super.anInt1426 = 0;
        anInt1650 = 0;
        anInt1651 = 0;
        for(int i = 0; i < anInt1626; i++)
        {
            int j = anIntArray1627[i];
            int k = anIntArray1628[i];
            int l = anIntArray1629[i];
            if(-k > super.anInt1426)
                super.anInt1426 = -k;
            if(k > anInt1651)
                anInt1651 = k;
            int i1 = j * j + l * l;
            if(i1 > anInt1650)
                anInt1650 = i1;
        }

        if(flag){
//            anInt1619 = 455;	// Removed due to it not being used anywhere except being set 4/20/17
        }
        anInt1650 = (int)(Math.sqrt(anInt1650) + 0.98999999999999999D);
        anInt1653 = (int)(Math.sqrt(anInt1650 * anInt1650 + super.anInt1426 * super.anInt1426) + 0.98999999999999999D);
        anInt1652 = anInt1653 + (int)(Math.sqrt(anInt1650 * anInt1650 + anInt1651 * anInt1651) + 0.98999999999999999D);
    }

    public void method467(boolean flag)
    {
        super.anInt1426 = 0;
        anInt1651 = 0;
        if(flag)
            aBoolean1615 = !aBoolean1615;
        for(int i = 0; i < anInt1626; i++)
        {
            int j = anIntArray1628[i];
            if(-j > super.anInt1426)
                super.anInt1426 = -j;
            if(j > anInt1651)
                anInt1651 = j;
        }

        anInt1653 = (int)(Math.sqrt(anInt1650 * anInt1650 + super.anInt1426 * super.anInt1426) + 0.98999999999999999D);
        anInt1652 = anInt1653 + (int)(Math.sqrt(anInt1650 * anInt1650 + anInt1651 * anInt1651) + 0.98999999999999999D);
    }

    public void method468(int i)
    {
        super.anInt1426 = 0;
        anInt1650 = 0;
        anInt1651 = 0;
        anInt1646 = 0xf423f;
        anInt1647 = 0xfff0bdc1;
        anInt1648 = 0xfffe7961;
        anInt1649 = 0x1869f;
        for(int j = 0; j < anInt1626; j++)
        {
            int k = anIntArray1627[j];
            int l = anIntArray1628[j];
            int i1 = anIntArray1629[j];
            if(k < anInt1646)
                anInt1646 = k;
            if(k > anInt1647)
                anInt1647 = k;
            if(i1 < anInt1649)
                anInt1649 = i1;
            if(i1 > anInt1648)
                anInt1648 = i1;
            if(-l > super.anInt1426)
                super.anInt1426 = -l;
            if(l > anInt1651)
                anInt1651 = l;
            int j1 = k * k + i1 * i1;
            if(j1 > anInt1650)
                anInt1650 = j1;
        }

        anInt1650 = (int)Math.sqrt(anInt1650);
        anInt1653 = (int)Math.sqrt(anInt1650 * anInt1650 + super.anInt1426 * super.anInt1426);
        if(i != 21073)
        {
            return;
        } else
        {
            anInt1652 = anInt1653 + (int)Math.sqrt(anInt1650 * anInt1650 + anInt1651 * anInt1651);
            return;
        }
    }

    public void method469(byte byte0)
    {
        if(byte0 != -71)
        {
            for(int i = 1; i > 0; i++);
        }
        if(anIntArray1655 != null)
        {
            int ai[] = new int[256];
            int j = 0;
            for(int l = 0; l < anInt1626; l++)
            {
                int j1 = anIntArray1655[l];
                ai[j1]++;
                if(j1 > j)
                    j = j1;
            }

            anIntArrayArray1657 = new int[j + 1][];
            for(int k1 = 0; k1 <= j; k1++)
            {
                anIntArrayArray1657[k1] = new int[ai[k1]];
                ai[k1] = 0;
            }

            for(int j2 = 0; j2 < anInt1626; j2++)
            {
                int l2 = anIntArray1655[j2];
                anIntArrayArray1657[l2][ai[l2]++] = j2;
            }

            anIntArray1655 = null;
        }
        if(anIntArray1656 != null)
        {
            int ai1[] = new int[256];
            int k = 0;
            for(int i1 = 0; i1 < anInt1630; i1++)
            {
                int l1 = anIntArray1656[i1];
                ai1[l1]++;
                if(l1 > k)
                    k = l1;
            }

            anIntArrayArray1658 = new int[k + 1][];
            for(int i2 = 0; i2 <= k; i2++)
            {
                anIntArrayArray1658[i2] = new int[ai1[i2]];
                ai1[i2] = 0;
            }

            for(int k2 = 0; k2 < anInt1630; k2++)
            {
                int i3 = anIntArray1656[k2];
                anIntArrayArray1658[i3][ai1[i3]++] = k2;
            }

            anIntArray1656 = null;
        }
    }

    public void method470(int i, int j)
    {
        if(anIntArrayArray1657 == null)
            return;
        if(i == -1)
            return;
        Class36 class36 = Class36.method531(anInt1614, i);
        if(class36 == null)
            return;
        Class18 class18 = class36.aClass18_637;
        if(j != 40542)
            return;
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        for(int k = 0; k < class36.anInt638; k++)
        {
            int l = class36.anIntArray639[k];
            method472(class18.anIntArray342[l], class18.anIntArrayArray343[l], class36.anIntArray640[k], class36.anIntArray641[k], class36.anIntArray642[k]);
        }

    }

    public void method471(int i, int ai[], int j, int k)
    {
        if(k == -1)
            return;
        if(ai == null || j == -1)
        {
            method470(k, 40542);
            return;
        }
        Class36 class36 = Class36.method531(anInt1614, k);
        if(class36 == null)
            return;
        Class36 class36_1 = Class36.method531(anInt1614, j);
        if(i != -20491)
            return;
        if(class36_1 == null)
        {
            method470(k, 40542);
            return;
        }
        Class18 class18 = class36.aClass18_637;
        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        int l = 0;
        int i1 = ai[l++];
        for(int j1 = 0; j1 < class36.anInt638; j1++)
        {
            int k1;
            for(k1 = class36.anIntArray639[j1]; k1 > i1; i1 = ai[l++]);
            if(k1 != i1 || class18.anIntArray342[k1] == 0)
                method472(class18.anIntArray342[k1], class18.anIntArrayArray343[k1], class36.anIntArray640[j1], class36.anIntArray641[j1], class36.anIntArray642[j1]);
        }

        anInt1681 = 0;
        anInt1682 = 0;
        anInt1683 = 0;
        l = 0;
        i1 = ai[l++];
        for(int l1 = 0; l1 < class36_1.anInt638; l1++)
        {
            int i2;
            for(i2 = class36_1.anIntArray639[l1]; i2 > i1; i1 = ai[l++]);
            if(i2 == i1 || class18.anIntArray342[i2] == 0)
                method472(class18.anIntArray342[i2], class18.anIntArrayArray343[i2], class36_1.anIntArray640[l1], class36_1.anIntArray641[l1], class36_1.anIntArray642[l1]);
        }

    }

    private void method472(int i, int ai[], int j, int k, int l)
    {
        int i1 = ai.length;
        if(i == 0)
        {
            int j1 = 0;
            anInt1681 = 0;
            anInt1682 = 0;
            anInt1683 = 0;
            for(int k2 = 0; k2 < i1; k2++)
            {
                int l3 = ai[k2];
                if(l3 < anIntArrayArray1657.length)
                {
                    int ai5[] = anIntArrayArray1657[l3];
                    for(int i5 = 0; i5 < ai5.length; i5++)
                    {
                        int j6 = ai5[i5];
                        anInt1681 += anIntArray1627[j6];
                        anInt1682 += anIntArray1628[j6];
                        anInt1683 += anIntArray1629[j6];
                        j1++;
                    }

                }
            }

            if(j1 > 0)
            {
                anInt1681 = anInt1681 / j1 + j;
                anInt1682 = anInt1682 / j1 + k;
                anInt1683 = anInt1683 / j1 + l;
                return;
            } else
            {
                anInt1681 = j;
                anInt1682 = k;
                anInt1683 = l;
                return;
            }
        }
        if(i == 1)
        {
            for(int k1 = 0; k1 < i1; k1++)
            {
                int l2 = ai[k1];
                if(l2 < anIntArrayArray1657.length)
                {
                    int ai1[] = anIntArrayArray1657[l2];
                    for(int i4 = 0; i4 < ai1.length; i4++)
                    {
                        int j5 = ai1[i4];
                        anIntArray1627[j5] += j;
                        anIntArray1628[j5] += k;
                        anIntArray1629[j5] += l;
                    }

                }
            }

            return;
        }
        if(i == 2)
        {
            for(int l1 = 0; l1 < i1; l1++)
            {
                int i3 = ai[l1];
                if(i3 < anIntArrayArray1657.length)
                {
                    int ai2[] = anIntArrayArray1657[i3];
                    for(int j4 = 0; j4 < ai2.length; j4++)
                    {
                        int k5 = ai2[j4];
                        anIntArray1627[k5] -= anInt1681;
                        anIntArray1628[k5] -= anInt1682;
                        anIntArray1629[k5] -= anInt1683;
                        int k6 = (j & 0xff) * 8;
                        int l6 = (k & 0xff) * 8;
                        int i7 = (l & 0xff) * 8;
                        if(i7 != 0)
                        {
                            int j7 = anIntArray1689[i7];
                            int i8 = anIntArray1690[i7];
                            int l8 = anIntArray1628[k5] * j7 + anIntArray1627[k5] * i8 >> 16;
                            anIntArray1628[k5] = anIntArray1628[k5] * i8 - anIntArray1627[k5] * j7 >> 16;
                            anIntArray1627[k5] = l8;
                        }
                        if(k6 != 0)
                        {
                            int k7 = anIntArray1689[k6];
                            int j8 = anIntArray1690[k6];
                            int i9 = anIntArray1628[k5] * j8 - anIntArray1629[k5] * k7 >> 16;
                            anIntArray1629[k5] = anIntArray1628[k5] * k7 + anIntArray1629[k5] * j8 >> 16;
                            anIntArray1628[k5] = i9;
                        }
                        if(l6 != 0)
                        {
                            int l7 = anIntArray1689[l6];
                            int k8 = anIntArray1690[l6];
                            int j9 = anIntArray1629[k5] * l7 + anIntArray1627[k5] * k8 >> 16;
                            anIntArray1629[k5] = anIntArray1629[k5] * k8 - anIntArray1627[k5] * l7 >> 16;
                            anIntArray1627[k5] = j9;
                        }
                        anIntArray1627[k5] += anInt1681;
                        anIntArray1628[k5] += anInt1682;
                        anIntArray1629[k5] += anInt1683;
                    }

                }
            }

            return;
        }
        if(i == 3)
        {
            for(int i2 = 0; i2 < i1; i2++)
            {
                int j3 = ai[i2];
                if(j3 < anIntArrayArray1657.length)
                {
                    int ai3[] = anIntArrayArray1657[j3];
                    for(int k4 = 0; k4 < ai3.length; k4++)
                    {
                        int l5 = ai3[k4];
                        anIntArray1627[l5] -= anInt1681;
                        anIntArray1628[l5] -= anInt1682;
                        anIntArray1629[l5] -= anInt1683;
                        anIntArray1627[l5] = (anIntArray1627[l5] * j) / 128;
                        anIntArray1628[l5] = (anIntArray1628[l5] * k) / 128;
                        anIntArray1629[l5] = (anIntArray1629[l5] * l) / 128;
                        anIntArray1627[l5] += anInt1681;
                        anIntArray1628[l5] += anInt1682;
                        anIntArray1629[l5] += anInt1683;
                    }

                }
            }

            return;
        }
        if(i == 5 && anIntArrayArray1658 != null && anIntArray1639 != null)
        {
            for(int j2 = 0; j2 < i1; j2++)
            {
                int k3 = ai[j2];
                if(k3 < anIntArrayArray1658.length)
                {
                    int ai4[] = anIntArrayArray1658[k3];
                    for(int l4 = 0; l4 < ai4.length; l4++)
                    {
                        int i6 = ai4[l4];
                        anIntArray1639[i6] += j * 8;
                        if(anIntArray1639[i6] < 0)
                            anIntArray1639[i6] = 0;
                        if(anIntArray1639[i6] > 255)
                            anIntArray1639[i6] = 255;
                    }

                }
            }

        }
    }

    public void method473(int i)
    {
        if(i <= 0)
            return;
        for(int j = 0; j < anInt1626; j++)
        {
            int k = anIntArray1627[j];
            anIntArray1627[j] = anIntArray1629[j];
            anIntArray1629[j] = -k;
        }

    }

    public void method474(int i, int j)
    {
        int k = anIntArray1689[i];
        int l = anIntArray1690[i];
        for(int i1 = 0; i1 < anInt1626; i1++)
        {
            int j1 = anIntArray1628[i1] * l - anIntArray1629[i1] * k >> 16;
            anIntArray1629[i1] = anIntArray1628[i1] * k + anIntArray1629[i1] * l >> 16;
            anIntArray1628[i1] = j1;
        }

        if(j < anInt1617 || j > anInt1617)
            anInt1617 = 324;
    }

    public void method475(int i, int j, int k, int l)
    {
        if(k != 16384)
            anInt1614 = -132;
        for(int i1 = 0; i1 < anInt1626; i1++)
        {
            anIntArray1627[i1] += i;
            anIntArray1628[i1] += j;
            anIntArray1629[i1] += l;
        }

    }

    public void method476(int i, int j)
    {
        for(int k = 0; k < anInt1630; k++)
            if(anIntArray1640[k] == i)
                anIntArray1640[k] = j;

    }

    public void method477(int i)
    {
        for(int j = 0; j < anInt1626; j++)
            anIntArray1629[j] = -anIntArray1629[j];

        for(int k = 0; k < anInt1630; k++)
        {
            int l = anIntArray1631[k];
            anIntArray1631[k] = anIntArray1633[k];
            anIntArray1633[k] = l;
        }

        if(i != 0){
//            anInt1619 = 107;	// Removed due to it not being used anywhere except being set 4/20/17
        }
    }

    public void method478(int i, int j, int k, int l)
    {
        if(k != 9)
            anInt1617 = -383;
        for(int i1 = 0; i1 < anInt1626; i1++)
        {
            anIntArray1627[i1] = (anIntArray1627[i1] * i) / 128;
            anIntArray1628[i1] = (anIntArray1628[i1] * l) / 128;
            anIntArray1629[i1] = (anIntArray1629[i1] * j) / 128;
        }

    }

    public final void method479(int i, int j, int k, int l, int i1, boolean flag)
    {
        int j1 = (int)Math.sqrt(k * k + l * l + i1 * i1);
        int k1 = j * j1 >> 8;
        if(anIntArray1634 == null)
        {
            anIntArray1634 = new int[anInt1630];
            anIntArray1635 = new int[anInt1630];
            anIntArray1636 = new int[anInt1630];
        }
        if(super.aClass33Array1425 == null)
        {
            super.aClass33Array1425 = new Class33[anInt1626];
            for(int l1 = 0; l1 < anInt1626; l1++)
                super.aClass33Array1425[l1] = new Class33();

        }
        for(int i2 = 0; i2 < anInt1630; i2++)
        {
            int j2 = anIntArray1631[i2];
            int l2 = anIntArray1632[i2];
            int i3 = anIntArray1633[i2];
            int j3 = anIntArray1627[l2] - anIntArray1627[j2];
            int k3 = anIntArray1628[l2] - anIntArray1628[j2];
            int l3 = anIntArray1629[l2] - anIntArray1629[j2];
            int i4 = anIntArray1627[i3] - anIntArray1627[j2];
            int j4 = anIntArray1628[i3] - anIntArray1628[j2];
            int k4 = anIntArray1629[i3] - anIntArray1629[j2];
            int l4 = k3 * k4 - j4 * l3;
            int i5 = l3 * i4 - k4 * j3;
            int j5;
            for(j5 = j3 * j4 - i4 * k3; l4 > 8192 || i5 > 8192 || j5 > 8192 || l4 < -8192 || i5 < -8192 || j5 < -8192; j5 >>= 1)
            {
                l4 >>= 1;
                i5 >>= 1;
            }

            int k5 = (int)Math.sqrt(l4 * l4 + i5 * i5 + j5 * j5);
            if(k5 <= 0)
                k5 = 1;
            l4 = (l4 * 256) / k5;
            i5 = (i5 * 256) / k5;
            j5 = (j5 * 256) / k5;
            if(anIntArray1637 == null || (anIntArray1637[i2] & 1) == 0)
            {
                Class33 class33_2 = super.aClass33Array1425[j2];
                class33_2.anInt602 += l4;
                class33_2.anInt603 += i5;
                class33_2.anInt604 += j5;
                class33_2.anInt605++;
                class33_2 = super.aClass33Array1425[l2];
                class33_2.anInt602 += l4;
                class33_2.anInt603 += i5;
                class33_2.anInt604 += j5;
                class33_2.anInt605++;
                class33_2 = super.aClass33Array1425[i3];
                class33_2.anInt602 += l4;
                class33_2.anInt603 += i5;
                class33_2.anInt604 += j5;
                class33_2.anInt605++;
            } else
            {
                int l5 = i + (k * l4 + l * i5 + i1 * j5) / (k1 + k1 / 2);
                anIntArray1634[i2] = method481(anIntArray1640[i2], l5, anIntArray1637[i2]);
            }
        }

        if(flag)
        {
            method480(i, k1, k, l, i1);
        } else
        {
            aClass33Array1660 = new Class33[anInt1626];
            for(int k2 = 0; k2 < anInt1626; k2++)
            {
                Class33 class33 = super.aClass33Array1425[k2];
                Class33 class33_1 = aClass33Array1660[k2] = new Class33();
                class33_1.anInt602 = class33.anInt602;
                class33_1.anInt603 = class33.anInt603;
                class33_1.anInt604 = class33.anInt604;
                class33_1.anInt605 = class33.anInt605;
            }

        }
        if(flag)
        {
            method466(false);
            return;
        } else
        {
            method468(21073);
            return;
        }
    }

    public final void method480(int i, int j, int k, int l, int i1)
    {
        for(int j1 = 0; j1 < anInt1630; j1++)
        {
            int k1 = anIntArray1631[j1];
            int i2 = anIntArray1632[j1];
            int j2 = anIntArray1633[j1];
            if(anIntArray1637 == null)
            {
                int i3 = anIntArray1640[j1];
                Class33 class33 = super.aClass33Array1425[k1];
                int k2 = i + (k * class33.anInt602 + l * class33.anInt603 + i1 * class33.anInt604) / (j * class33.anInt605);
                anIntArray1634[j1] = method481(i3, k2, 0);
                class33 = super.aClass33Array1425[i2];
                k2 = i + (k * class33.anInt602 + l * class33.anInt603 + i1 * class33.anInt604) / (j * class33.anInt605);
                anIntArray1635[j1] = method481(i3, k2, 0);
                class33 = super.aClass33Array1425[j2];
                k2 = i + (k * class33.anInt602 + l * class33.anInt603 + i1 * class33.anInt604) / (j * class33.anInt605);
                anIntArray1636[j1] = method481(i3, k2, 0);
            } else
            if((anIntArray1637[j1] & 1) == 0)
            {
                int j3 = anIntArray1640[j1];
                int k3 = anIntArray1637[j1];
                Class33 class33_1 = super.aClass33Array1425[k1];
                int l2 = i + (k * class33_1.anInt602 + l * class33_1.anInt603 + i1 * class33_1.anInt604) / (j * class33_1.anInt605);
                anIntArray1634[j1] = method481(j3, l2, k3);
                class33_1 = super.aClass33Array1425[i2];
                l2 = i + (k * class33_1.anInt602 + l * class33_1.anInt603 + i1 * class33_1.anInt604) / (j * class33_1.anInt605);
                anIntArray1635[j1] = method481(j3, l2, k3);
                class33_1 = super.aClass33Array1425[j2];
                l2 = i + (k * class33_1.anInt602 + l * class33_1.anInt603 + i1 * class33_1.anInt604) / (j * class33_1.anInt605);
                anIntArray1636[j1] = method481(j3, l2, k3);
            }
        }

        super.aClass33Array1425 = null;
        aClass33Array1660 = null;
        anIntArray1655 = null;
        anIntArray1656 = null;
        if(anIntArray1637 != null)
        {
            for(int l1 = 0; l1 < anInt1630; l1++)
                if((anIntArray1637[l1] & 2) == 2)
                    return;

        }
        anIntArray1640 = null;
    }

    public static final int method481(int i, int j, int k)
    {
        if((k & 2) == 2)
        {
            if(j < 0)
                j = 0;
            else
            if(j > 127)
                j = 127;
            j = 127 - j;
            return j;
        }
        j = j * (i & 0x7f) >> 7;
        if(j < 2)
            j = 2;
        else
        if(j > 126)
            j = 126;
        return (i & 0xff80) + j;
    }

    public final void method482(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = Class30_Sub2_Sub1_Sub3.anInt1466;
        int i2 = Class30_Sub2_Sub1_Sub3.anInt1467;
        int j2 = anIntArray1689[i];
        int k2 = anIntArray1690[i];
        int l2 = anIntArray1689[j];
        int i3 = anIntArray1690[j];
        int j3 = anIntArray1689[k];
        int k3 = anIntArray1690[k];
        int l3 = anIntArray1689[l];
        int i4 = anIntArray1690[l];
        int j4 = j1 * l3 + k1 * i4 >> 16;
        for(int k4 = 0; k4 < anInt1626; k4++)
        {
            int l4 = anIntArray1627[k4];
            int i5 = anIntArray1628[k4];
            int j5 = anIntArray1629[k4];
            if(k != 0)
            {
                int k5 = i5 * j3 + l4 * k3 >> 16;
                i5 = i5 * k3 - l4 * j3 >> 16;
                l4 = k5;
            }
            if(i != 0)
            {
                int l5 = i5 * k2 - j5 * j2 >> 16;
                j5 = i5 * j2 + j5 * k2 >> 16;
                i5 = l5;
            }
            if(j != 0)
            {
                int i6 = j5 * l2 + l4 * i3 >> 16;
                j5 = j5 * i3 - l4 * l2 >> 16;
                l4 = i6;
            }
            l4 += i1;
            i5 += j1;
            j5 += k1;
            int j6 = i5 * i4 - j5 * l3 >> 16;
            j5 = i5 * l3 + j5 * i4 >> 16;
            i5 = j6;
            anIntArray1667[k4] = j5 - j4;
            anIntArray1665[k4] = l1 + (l4 << 9) / j5;
            anIntArray1666[k4] = i2 + (i5 << 9) / j5;
            if(anInt1642 > 0)
            {
                anIntArray1668[k4] = l4;
                anIntArray1669[k4] = i5;
                anIntArray1670[k4] = j5;
            }
        }

        try
        {
            method483(false, false, 0);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public final void method443(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
    {
        int j2 = l1 * i1 - j1 * l >> 16;
        int k2 = k1 * j + j2 * k >> 16;
        int l2 = anInt1650 * k >> 16;
        int i3 = k2 + l2;
        if(i3 <= 50 || k2 >= 3500)
            return;
        int j3 = l1 * l + j1 * i1 >> 16;
        int k3 = j3 - anInt1650 << 9;
        if(k3 / i3 >= Class30_Sub2_Sub1.anInt1386)
            return;
        int l3 = j3 + anInt1650 << 9;
        if(l3 / i3 <= -Class30_Sub2_Sub1.anInt1386)
            return;
        int i4 = k1 * k - j2 * j >> 16;
        int j4 = anInt1650 * j >> 16;
        int k4 = i4 + j4 << 9;
        if(k4 / i3 <= -Class30_Sub2_Sub1.anInt1387)
            return;
        int l4 = j4 + (super.anInt1426 * k >> 16);
        int i5 = i4 - l4 << 9;
        if(i5 / i3 >= Class30_Sub2_Sub1.anInt1387)
            return;
        int j5 = l2 + (super.anInt1426 * j >> 16);
        boolean flag = false;
        if(k2 - j5 <= 50)
            flag = true;
        boolean flag1 = false;
        if(i2 > 0 && aBoolean1684)
        {
            int k5 = k2 - l2;
            if(k5 <= 50)
                k5 = 50;
            if(j3 > 0)
            {
                k3 /= i3;
                l3 /= k5;
            } else
            {
                l3 /= i3;
                k3 /= k5;
            }
            if(i4 > 0)
            {
                i5 /= i3;
                k4 /= k5;
            } else
            {
                k4 /= i3;
                i5 /= k5;
            }
            int i6 = anInt1685 - Class30_Sub2_Sub1_Sub3.anInt1466;
            int k6 = anInt1686 - Class30_Sub2_Sub1_Sub3.anInt1467;
            if(i6 > k3 && i6 < l3 && k6 > i5 && k6 < k4)
                if(aBoolean1659)
                    anIntArray1688[anInt1687++] = i2;
                else
                    flag1 = true;
        }
        int l5 = Class30_Sub2_Sub1_Sub3.anInt1466;
        int j6 = Class30_Sub2_Sub1_Sub3.anInt1467;
        int l6 = 0;
        int i7 = 0;
        if(i != 0)
        {
            l6 = anIntArray1689[i];
            i7 = anIntArray1690[i];
        }
        for(int j7 = 0; j7 < anInt1626; j7++)
        {
            int k7 = anIntArray1627[j7];
            int l7 = anIntArray1628[j7];
            int i8 = anIntArray1629[j7];
            if(i != 0)
            {
                int j8 = i8 * l6 + k7 * i7 >> 16;
                i8 = i8 * i7 - k7 * l6 >> 16;
                k7 = j8;
            }
            k7 += j1;
            l7 += k1;
            i8 += l1;
            int k8 = i8 * l + k7 * i1 >> 16;
            i8 = i8 * i1 - k7 * l >> 16;
            k7 = k8;
            k8 = l7 * k - i8 * j >> 16;
            i8 = l7 * j + i8 * k >> 16;
            l7 = k8;
            anIntArray1667[j7] = i8 - k2;
            if(i8 >= 50)
            {
                anIntArray1665[j7] = l5 + (k7 << 9) / i8;
                anIntArray1666[j7] = j6 + (l7 << 9) / i8;
            } else
            {
                anIntArray1665[j7] = -5000;
                flag = true;
            }
            if(flag || anInt1642 > 0)
            {
                anIntArray1668[j7] = k7;
                anIntArray1669[j7] = l7;
                anIntArray1670[j7] = i8;
            }
        }

        try
        {
            method483(flag, flag1, i2);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    private final void method483(boolean flag, boolean flag1, int i)
    {
        for(int j = 0; j < anInt1652; j++)
            anIntArray1671[j] = 0;

        for(int k = 0; k < anInt1630; k++)
            if(anIntArray1637 == null || anIntArray1637[k] != -1)
            {
                int l = anIntArray1631[k];
                int k1 = anIntArray1632[k];
                int j2 = anIntArray1633[k];
                int i3 = anIntArray1665[l];
                int l3 = anIntArray1665[k1];
                int k4 = anIntArray1665[j2];
                if(flag && (i3 == -5000 || l3 == -5000 || k4 == -5000))
                {
                    aBooleanArray1664[k] = true;
                    int j5 = (anIntArray1667[l] + anIntArray1667[k1] + anIntArray1667[j2]) / 3 + anInt1653;
                    anIntArrayArray1672[j5][anIntArray1671[j5]++] = k;
                } else
                {
                    if(flag1 && method486(anInt1685, anInt1686, anIntArray1666[l], anIntArray1666[k1], anIntArray1666[j2], i3, l3, k4))
                    {
                        anIntArray1688[anInt1687++] = i;
                        flag1 = false;
                    }
                    if((i3 - l3) * (anIntArray1666[j2] - anIntArray1666[k1]) - (anIntArray1666[l] - anIntArray1666[k1]) * (k4 - l3) > 0)
                    {
                        aBooleanArray1664[k] = false;
                        if(i3 < 0 || l3 < 0 || k4 < 0 || i3 > Class30_Sub2_Sub1.anInt1385 || l3 > Class30_Sub2_Sub1.anInt1385 || k4 > Class30_Sub2_Sub1.anInt1385)
                            aBooleanArray1663[k] = true;
                        else
                            aBooleanArray1663[k] = false;
                        int k5 = (anIntArray1667[l] + anIntArray1667[k1] + anIntArray1667[j2]) / 3 + anInt1653;
                        anIntArrayArray1672[k5][anIntArray1671[k5]++] = k;
                    }
                }
            }

        if(anIntArray1638 == null)
        {
            for(int i1 = anInt1652 - 1; i1 >= 0; i1--)
            {
                int l1 = anIntArray1671[i1];
                if(l1 > 0)
                {
                    int ai[] = anIntArrayArray1672[i1];
                    for(int j3 = 0; j3 < l1; j3++)
                        method484(ai[j3]);

                }
            }

            return;
        }
        for(int j1 = 0; j1 < 12; j1++)
        {
            anIntArray1673[j1] = 0;
            anIntArray1677[j1] = 0;
        }

        for(int i2 = anInt1652 - 1; i2 >= 0; i2--)
        {
            int k2 = anIntArray1671[i2];
            if(k2 > 0)
            {
                int ai1[] = anIntArrayArray1672[i2];
                for(int i4 = 0; i4 < k2; i4++)
                {
                    int l4 = ai1[i4];
                    int l5 = anIntArray1638[l4];
                    int j6 = anIntArray1673[l5]++;
                    anIntArrayArray1674[l5][j6] = l4;
                    if(l5 < 10)
                        anIntArray1677[l5] += i2;
                    else
                    if(l5 == 10)
                        anIntArray1675[j6] = i2;
                    else
                        anIntArray1676[j6] = i2;
                }

            }
        }

        int l2 = 0;
        if(anIntArray1673[1] > 0 || anIntArray1673[2] > 0)
            l2 = (anIntArray1677[1] + anIntArray1677[2]) / (anIntArray1673[1] + anIntArray1673[2]);
        int k3 = 0;
        if(anIntArray1673[3] > 0 || anIntArray1673[4] > 0)
            k3 = (anIntArray1677[3] + anIntArray1677[4]) / (anIntArray1673[3] + anIntArray1673[4]);
        int j4 = 0;
        if(anIntArray1673[6] > 0 || anIntArray1673[8] > 0)
            j4 = (anIntArray1677[6] + anIntArray1677[8]) / (anIntArray1673[6] + anIntArray1673[8]);
        int i6 = 0;
        int k6 = anIntArray1673[10];
        int ai2[] = anIntArrayArray1674[10];
        int ai3[] = anIntArray1675;
        if(i6 == k6)
        {
            i6 = 0;
            k6 = anIntArray1673[11];
            ai2 = anIntArrayArray1674[11];
            ai3 = anIntArray1676;
        }
        int i5;
        if(i6 < k6)
            i5 = ai3[i6];
        else
            i5 = -1000;
        for(int l6 = 0; l6 < 10; l6++)
        {
            while(l6 == 0 && i5 > l2) 
            {
                method484(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1674[11])
                {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            while(l6 == 3 && i5 > k3) 
            {
                method484(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1674[11])
                {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            while(l6 == 5 && i5 > j4) 
            {
                method484(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1674[11])
                {
                    i6 = 0;
                    k6 = anIntArray1673[11];
                    ai2 = anIntArrayArray1674[11];
                    ai3 = anIntArray1676;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            int i7 = anIntArray1673[l6];
            int ai4[] = anIntArrayArray1674[l6];
            for(int j7 = 0; j7 < i7; j7++)
                method484(ai4[j7]);

        }

        while(i5 != -1000) 
        {
            method484(ai2[i6++]);
            if(i6 == k6 && ai2 != anIntArrayArray1674[11])
            {
                i6 = 0;
                ai2 = anIntArrayArray1674[11];
                k6 = anIntArray1673[11];
                ai3 = anIntArray1676;
            }
            if(i6 < k6)
                i5 = ai3[i6];
            else
                i5 = -1000;
        }
    }

    private final void method484(int i)
    {
        if(aBooleanArray1664[i])
        {
            method485(i);
            return;
        }
        int j = anIntArray1631[i];
        int k = anIntArray1632[i];
        int l = anIntArray1633[i];
        Class30_Sub2_Sub1_Sub3.aBoolean1462 = aBooleanArray1663[i];
        if(anIntArray1639 == null)
            Class30_Sub2_Sub1_Sub3.anInt1465 = 0;
        else
            Class30_Sub2_Sub1_Sub3.anInt1465 = anIntArray1639[i];
        int i1;
        if(anIntArray1637 == null)
            i1 = 0;
        else
            i1 = anIntArray1637[i] & 3;
        if(i1 == 0)
        {
            Class30_Sub2_Sub1_Sub3.method374(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], anIntArray1634[i], anIntArray1635[i], anIntArray1636[i]);
            return;
        }
        if(i1 == 1)
        {
            Class30_Sub2_Sub1_Sub3.method376(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], anIntArray1691[anIntArray1634[i]]);
            return;
        }
        if(i1 == 2)
        {
            int j1 = anIntArray1637[i] >> 2;
            int l1 = anIntArray1643[j1];
            int j2 = anIntArray1644[j1];
            int l2 = anIntArray1645[j1];
            Class30_Sub2_Sub1_Sub3.method378(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], anIntArray1634[i], anIntArray1635[i], anIntArray1636[i], anIntArray1668[l1], anIntArray1668[j2], anIntArray1668[l2], anIntArray1669[l1], anIntArray1669[j2], anIntArray1669[l2], anIntArray1670[l1], anIntArray1670[j2], anIntArray1670[l2], anIntArray1640[i]);
            return;
        }
        if(i1 == 3)
        {
            int k1 = anIntArray1637[i] >> 2;
            int i2 = anIntArray1643[k1];
            int k2 = anIntArray1644[k1];
            int i3 = anIntArray1645[k1];
            Class30_Sub2_Sub1_Sub3.method378(anIntArray1666[j], anIntArray1666[k], anIntArray1666[l], anIntArray1665[j], anIntArray1665[k], anIntArray1665[l], anIntArray1634[i], anIntArray1634[i], anIntArray1634[i], anIntArray1668[i2], anIntArray1668[k2], anIntArray1668[i3], anIntArray1669[i2], anIntArray1669[k2], anIntArray1669[i3], anIntArray1670[i2], anIntArray1670[k2], anIntArray1670[i3], anIntArray1640[i]);
        }
    }

    private final void method485(int i)
    {
        int j = Class30_Sub2_Sub1_Sub3.anInt1466;
        int k = Class30_Sub2_Sub1_Sub3.anInt1467;
        int l = 0;
        int i1 = anIntArray1631[i];
        int j1 = anIntArray1632[i];
        int k1 = anIntArray1633[i];
        int l1 = anIntArray1670[i1];
        int i2 = anIntArray1670[j1];
        int j2 = anIntArray1670[k1];
        if(l1 >= 50)
        {
            anIntArray1678[l] = anIntArray1665[i1];
            anIntArray1679[l] = anIntArray1666[i1];
            anIntArray1680[l++] = anIntArray1634[i];
        } else
        {
            int k2 = anIntArray1668[i1];
            int k3 = anIntArray1669[i1];
            int k4 = anIntArray1634[i];
            if(j2 >= 50)
            {
                int k5 = (50 - l1) * anIntArray1692[j2 - l1];
                anIntArray1678[l] = j + (k2 + ((anIntArray1668[k1] - k2) * k5 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (k3 + ((anIntArray1669[k1] - k3) * k5 >> 16) << 9) / 50;
                anIntArray1680[l++] = k4 + ((anIntArray1636[i] - k4) * k5 >> 16);
            }
            if(i2 >= 50)
            {
                int l5 = (50 - l1) * anIntArray1692[i2 - l1];
                anIntArray1678[l] = j + (k2 + ((anIntArray1668[j1] - k2) * l5 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (k3 + ((anIntArray1669[j1] - k3) * l5 >> 16) << 9) / 50;
                anIntArray1680[l++] = k4 + ((anIntArray1635[i] - k4) * l5 >> 16);
            }
        }
        if(i2 >= 50)
        {
            anIntArray1678[l] = anIntArray1665[j1];
            anIntArray1679[l] = anIntArray1666[j1];
            anIntArray1680[l++] = anIntArray1635[i];
        } else
        {
            int l2 = anIntArray1668[j1];
            int l3 = anIntArray1669[j1];
            int l4 = anIntArray1635[i];
            if(l1 >= 50)
            {
                int i6 = (50 - i2) * anIntArray1692[l1 - i2];
                anIntArray1678[l] = j + (l2 + ((anIntArray1668[i1] - l2) * i6 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (l3 + ((anIntArray1669[i1] - l3) * i6 >> 16) << 9) / 50;
                anIntArray1680[l++] = l4 + ((anIntArray1634[i] - l4) * i6 >> 16);
            }
            if(j2 >= 50)
            {
                int j6 = (50 - i2) * anIntArray1692[j2 - i2];
                anIntArray1678[l] = j + (l2 + ((anIntArray1668[k1] - l2) * j6 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (l3 + ((anIntArray1669[k1] - l3) * j6 >> 16) << 9) / 50;
                anIntArray1680[l++] = l4 + ((anIntArray1636[i] - l4) * j6 >> 16);
            }
        }
        if(j2 >= 50)
        {
            anIntArray1678[l] = anIntArray1665[k1];
            anIntArray1679[l] = anIntArray1666[k1];
            anIntArray1680[l++] = anIntArray1636[i];
        } else
        {
            int i3 = anIntArray1668[k1];
            int i4 = anIntArray1669[k1];
            int i5 = anIntArray1636[i];
            if(i2 >= 50)
            {
                int k6 = (50 - j2) * anIntArray1692[i2 - j2];
                anIntArray1678[l] = j + (i3 + ((anIntArray1668[j1] - i3) * k6 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (i4 + ((anIntArray1669[j1] - i4) * k6 >> 16) << 9) / 50;
                anIntArray1680[l++] = i5 + ((anIntArray1635[i] - i5) * k6 >> 16);
            }
            if(l1 >= 50)
            {
                int l6 = (50 - j2) * anIntArray1692[l1 - j2];
                anIntArray1678[l] = j + (i3 + ((anIntArray1668[i1] - i3) * l6 >> 16) << 9) / 50;
                anIntArray1679[l] = k + (i4 + ((anIntArray1669[i1] - i4) * l6 >> 16) << 9) / 50;
                anIntArray1680[l++] = i5 + ((anIntArray1634[i] - i5) * l6 >> 16);
            }
        }
        int j3 = anIntArray1678[0];
        int j4 = anIntArray1678[1];
        int j5 = anIntArray1678[2];
        int i7 = anIntArray1679[0];
        int j7 = anIntArray1679[1];
        int k7 = anIntArray1679[2];
        if((j3 - j4) * (k7 - j7) - (i7 - j7) * (j5 - j4) > 0)
        {
            Class30_Sub2_Sub1_Sub3.aBoolean1462 = false;
            if(l == 3)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > Class30_Sub2_Sub1.anInt1385 || j4 > Class30_Sub2_Sub1.anInt1385 || j5 > Class30_Sub2_Sub1.anInt1385)
                    Class30_Sub2_Sub1_Sub3.aBoolean1462 = true;
                int l7;
                if(anIntArray1637 == null)
                    l7 = 0;
                else
                    l7 = anIntArray1637[i] & 3;
                if(l7 == 0)
                    Class30_Sub2_Sub1_Sub3.method374(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2]);
                else
                if(l7 == 1)
                    Class30_Sub2_Sub1_Sub3.method376(i7, j7, k7, j3, j4, j5, anIntArray1691[anIntArray1634[i]]);
                else
                if(l7 == 2)
                {
                    int j8 = anIntArray1637[i] >> 2;
                    int k9 = anIntArray1643[j8];
                    int k10 = anIntArray1644[j8];
                    int k11 = anIntArray1645[j8];
                    Class30_Sub2_Sub1_Sub3.method378(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], anIntArray1668[k9], anIntArray1668[k10], anIntArray1668[k11], anIntArray1669[k9], anIntArray1669[k10], anIntArray1669[k11], anIntArray1670[k9], anIntArray1670[k10], anIntArray1670[k11], anIntArray1640[i]);
                } else
                if(l7 == 3)
                {
                    int k8 = anIntArray1637[i] >> 2;
                    int l9 = anIntArray1643[k8];
                    int l10 = anIntArray1644[k8];
                    int l11 = anIntArray1645[k8];
                    Class30_Sub2_Sub1_Sub3.method378(i7, j7, k7, j3, j4, j5, anIntArray1634[i], anIntArray1634[i], anIntArray1634[i], anIntArray1668[l9], anIntArray1668[l10], anIntArray1668[l11], anIntArray1669[l9], anIntArray1669[l10], anIntArray1669[l11], anIntArray1670[l9], anIntArray1670[l10], anIntArray1670[l11], anIntArray1640[i]);
                }
            }
            if(l == 4)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > Class30_Sub2_Sub1.anInt1385 || j4 > Class30_Sub2_Sub1.anInt1385 || j5 > Class30_Sub2_Sub1.anInt1385 || anIntArray1678[3] < 0 || anIntArray1678[3] > Class30_Sub2_Sub1.anInt1385)
                    Class30_Sub2_Sub1_Sub3.aBoolean1462 = true;
                int i8;
                if(anIntArray1637 == null)
                    i8 = 0;
                else
                    i8 = anIntArray1637[i] & 3;
                if(i8 == 0)
                {
                    Class30_Sub2_Sub1_Sub3.method374(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2]);
                    Class30_Sub2_Sub1_Sub3.method374(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], anIntArray1680[0], anIntArray1680[2], anIntArray1680[3]);
                    return;
                }
                if(i8 == 1)
                {
                    int l8 = anIntArray1691[anIntArray1634[i]];
                    Class30_Sub2_Sub1_Sub3.method376(i7, j7, k7, j3, j4, j5, l8);
                    Class30_Sub2_Sub1_Sub3.method376(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], l8);
                    return;
                }
                if(i8 == 2)
                {
                    int i9 = anIntArray1637[i] >> 2;
                    int i10 = anIntArray1643[i9];
                    int i11 = anIntArray1644[i9];
                    int i12 = anIntArray1645[i9];
                    Class30_Sub2_Sub1_Sub3.method378(i7, j7, k7, j3, j4, j5, anIntArray1680[0], anIntArray1680[1], anIntArray1680[2], anIntArray1668[i10], anIntArray1668[i11], anIntArray1668[i12], anIntArray1669[i10], anIntArray1669[i11], anIntArray1669[i12], anIntArray1670[i10], anIntArray1670[i11], anIntArray1670[i12], anIntArray1640[i]);
                    Class30_Sub2_Sub1_Sub3.method378(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], anIntArray1680[0], anIntArray1680[2], anIntArray1680[3], anIntArray1668[i10], anIntArray1668[i11], anIntArray1668[i12], anIntArray1669[i10], anIntArray1669[i11], anIntArray1669[i12], anIntArray1670[i10], anIntArray1670[i11], anIntArray1670[i12], anIntArray1640[i]);
                    return;
                }
                if(i8 == 3)
                {
                    int j9 = anIntArray1637[i] >> 2;
                    int j10 = anIntArray1643[j9];
                    int j11 = anIntArray1644[j9];
                    int j12 = anIntArray1645[j9];
                    Class30_Sub2_Sub1_Sub3.method378(i7, j7, k7, j3, j4, j5, anIntArray1634[i], anIntArray1634[i], anIntArray1634[i], anIntArray1668[j10], anIntArray1668[j11], anIntArray1668[j12], anIntArray1669[j10], anIntArray1669[j11], anIntArray1669[j12], anIntArray1670[j10], anIntArray1670[j11], anIntArray1670[j12], anIntArray1640[i]);
                    Class30_Sub2_Sub1_Sub3.method378(i7, k7, anIntArray1679[3], j3, j5, anIntArray1678[3], anIntArray1634[i], anIntArray1634[i], anIntArray1634[i], anIntArray1668[j10], anIntArray1668[j11], anIntArray1668[j12], anIntArray1669[j10], anIntArray1669[j11], anIntArray1669[j12], anIntArray1670[j10], anIntArray1670[j11], anIntArray1670[j12], anIntArray1640[i]);
                }
            }
        }
    }

    private final boolean method486(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if(j < k && j < l && j < i1)
            return false;
        if(j > k && j > l && j > i1)
            return false;
        if(i < j1 && i < k1 && i < l1)
            return false;
        return i <= j1 || i <= k1 || i <= l1;
    }

    private int anInt1614;
    private boolean aBoolean1615;
//    private int anInt1616;	//Said its not used 4/20/17
    private int anInt1617;
    private boolean aBoolean1618;
//    private static int anInt1619 = -192;	//Said its not used 4/20/17
    public static int anInt1620;
    public static Class30_Sub2_Sub4_Sub6 aClass30_Sub2_Sub4_Sub6_1621 = new Class30_Sub2_Sub4_Sub6(true);
    private static int anIntArray1622[] = new int[2000];
    private static int anIntArray1623[] = new int[2000];
    private static int anIntArray1624[] = new int[2000];
    private static int anIntArray1625[] = new int[2000];
    public int anInt1626;
    public int anIntArray1627[];
    public int anIntArray1628[];
    public int anIntArray1629[];
    public int anInt1630;
    public int anIntArray1631[];
    public int anIntArray1632[];
    public int anIntArray1633[];
    public int anIntArray1634[];
    public int anIntArray1635[];
    public int anIntArray1636[];
    public int anIntArray1637[];
    public int anIntArray1638[];
    public int anIntArray1639[];
    public int anIntArray1640[];
    public int anInt1641;
    public int anInt1642;
    public int anIntArray1643[];
    public int anIntArray1644[];
    public int anIntArray1645[];
    public int anInt1646;
    public int anInt1647;
    public int anInt1648;
    public int anInt1649;
    public int anInt1650;
    public int anInt1651;
    public int anInt1652;
    public int anInt1653;
    public int anInt1654;
    public int anIntArray1655[];
    public int anIntArray1656[];
    public int anIntArrayArray1657[][];
    public int anIntArrayArray1658[][];
    public boolean aBoolean1659;
    Class33 aClass33Array1660[];
    static Class21 aClass21Array1661[];
    static Class42 aClass42_1662;
    static boolean aBooleanArray1663[] = new boolean[4096];
    static boolean aBooleanArray1664[] = new boolean[4096];
    static int anIntArray1665[] = new int[4096];
    static int anIntArray1666[] = new int[4096];
    static int anIntArray1667[] = new int[4096];
    static int anIntArray1668[] = new int[4096];
    static int anIntArray1669[] = new int[4096];
    static int anIntArray1670[] = new int[4096];
    static int anIntArray1671[] = new int[1500];
    static int anIntArrayArray1672[][] = new int[1500][512];
    static int anIntArray1673[] = new int[12];
    static int anIntArrayArray1674[][] = new int[12][2000];
    static int anIntArray1675[] = new int[2000];
    static int anIntArray1676[] = new int[2000];
    static int anIntArray1677[] = new int[12];
    static int anIntArray1678[] = new int[10];
    static int anIntArray1679[] = new int[10];
    static int anIntArray1680[] = new int[10];
    static int anInt1681;
    static int anInt1682;
    static int anInt1683;
    public static boolean aBoolean1684;
    public static int anInt1685;
    public static int anInt1686;
    public static int anInt1687;
    public static int anIntArray1688[] = new int[1000];
    public static int anIntArray1689[];
    public static int anIntArray1690[];
    static int anIntArray1691[];
    static int anIntArray1692[];

    static 
    {
        anIntArray1689 = Class30_Sub2_Sub1_Sub3.anIntArray1470;
        anIntArray1690 = Class30_Sub2_Sub1_Sub3.anIntArray1471;
        anIntArray1691 = Class30_Sub2_Sub1_Sub3.anIntArray1482;
        anIntArray1692 = Class30_Sub2_Sub1_Sub3.anIntArray1469;
    }
}
