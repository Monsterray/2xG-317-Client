// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


final class Class46
{

	public static final Class46 method572(int i)
	{
		for(int j = 0; j < 20; j++)
			if(aClass46Array782[j].anInt754 == i)
				return aClass46Array782[j];

		anInt771 = (anInt771 + 1) % 20;
		Class46 class46 = aClass46Array782[anInt771];
		aClass30_Sub2_Sub2_753.anInt1406 = anIntArray755[i];
		class46.anInt754 = i;
		class46.method573();
		class46.method582(true, aClass30_Sub2_Sub2_753);
if(i == 4755) {
	class46.aString739 = "Godwars entrance";		
	class46.aByteArray777 = "No way comming back!".getBytes();	
	class46.anInt744 = 4;					
	class46.anInt761 = 4;					
	class46.anIntArray773 = new int[1];
	class46.anIntArray773[0] = 13055;				
		class46.aBoolean778 = true;   				
		class46.aBoolean767 = true;   				
		class46.aBoolean762 = false;				
		class46.aBoolean769 = false;				
	}
if(i == 13181) {
	class46.aString739 = "Bandos altar";		
	class46.aByteArray777 = "Pray for the power of the mighty god Bandos".getBytes();	
	class46.anInt744 = 3;					
	class46.anInt761 = 3;					
	class46.anIntArray773 = new int[1];
	class46.anIntArray773[0] = 13050;				
		class46.aBoolean778 = true;   				
		class46.aBoolean767 = true;   				
		class46.aBoolean762 = false;				
		class46.aBoolean769 = false;				
	}
		return class46;
	}

	private final void method573()
	{
		anIntArray773 = null;
		anIntArray776 = null;
		aString739 = null;
		aByteArray777 = null;
		anIntArray784 = null;
		anIntArray747 = null;
		anInt744 = 1;
		anInt761 = 1;
		aBoolean767 = true;
		aBoolean757 = true;
		aBoolean778 = false;
		aBoolean762 = false;
		aBoolean769 = false;
		aBoolean764 = false;
		anInt781 = -1;
		anInt775 = 16;
		aByte737 = 0;
		aByte742 = 0;
		aStringArray786 = null;
		anInt746 = -1;
		anInt758 = -1;
		aBoolean751 = false;
		aBoolean779 = true;
		anInt748 = 128;
		anInt772 = 128;
		anInt740 = 128;
		anInt768 = 0;
		anInt738 = 0;
		anInt745 = 0;
		anInt783 = 0;
		aBoolean736 = false;
		aBoolean766 = false;
		anInt760 = -1;
		anInt774 = -1;
		anInt749 = -1;
		anIntArray759 = null;
	}

	public final void method574(Class42_Sub1 class42_sub1, int i)
	{
		if(anIntArray773 == null)
			return;
		for(int j = 0; j < anIntArray773.length; j++)
			class42_sub1.method560(anIntArray773[j] & 0xffff, 0, false);

		while(i >= 0) 
			aBoolean763 = !aBoolean763;
	}

	public static final void method575(int i)
	{
		aClass12_785 = null;
		aClass12_780 = null;
		anIntArray755 = null;
		aClass46Array782 = null;
		for(aClass30_Sub2_Sub2_753 = null; i >= 0;)
			return;

	}

	public static final void method576(Class44 class44)
	{
		aClass30_Sub2_Sub2_753 = new Class30_Sub2_Sub2(class44.method571("loc.dat", null), 891);
		Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("loc.idx", null), 891);
		anInt756 = class30_sub2_sub2.method410();
		 anIntArray755 = new int[anInt756 + 1000];
		int i = 2;
		for(int j = 0; j < anInt756; j++)
		{
			anIntArray755[j] = i;
			i += class30_sub2_sub2.method410();
		}

		aClass46Array782 = new Class46[20];
		for(int k = 0; k < 20; k++)
			aClass46Array782[k] = new Class46();

	}

	public final boolean method577(int i, boolean flag)
	{
		if(!flag)
			throw new NullPointerException();
		if(anIntArray776 == null)
		{
			if(anIntArray773 == null)
				return true;
			if(i != 10)
				return true;
			boolean flag1 = true;
			for(int k = 0; k < anIntArray773.length; k++)
				flag1 &= Class30_Sub2_Sub4_Sub6.method463(anIntArray773[k] & 0xffff);

			return flag1;
		}
		for(int j = 0; j < anIntArray776.length; j++)
			if(anIntArray776[j] == i)
				return Class30_Sub2_Sub4_Sub6.method463(anIntArray773[j] & 0xffff);

		return true;
	}

	public final Class30_Sub2_Sub4_Sub6 method578(int i, int j, int k, int l, int i1, int j1, int k1)
	{
		Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = method581(0, i, k1, j);
		if(class30_sub2_sub4_sub6 == null)
			return null;
		if(aBoolean762 || aBoolean769)
			class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(aBoolean762, -819, aBoolean769, class30_sub2_sub4_sub6);
		if(aBoolean762)
		{
			int l1 = (k + l + i1 + j1) / 4;
			for(int i2 = 0; i2 < class30_sub2_sub4_sub6.anInt1626; i2++)
			{
				int j2 = class30_sub2_sub4_sub6.anIntArray1627[i2];
				int k2 = class30_sub2_sub4_sub6.anIntArray1629[i2];
				int l2 = k + ((l - k) * (j2 + 64)) / 128;
				int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
				int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
				class30_sub2_sub4_sub6.anIntArray1628[i2] += j3 - l1;
			}

			class30_sub2_sub4_sub6.method467(false);
		}
		return class30_sub2_sub4_sub6;
	}

	public final boolean method579(boolean flag)
	{
		if(anIntArray773 == null)
			return true;
		boolean flag1 = true;
		for(int i = 0; i < anIntArray773.length; i++)
			flag1 &= Class30_Sub2_Sub4_Sub6.method463(anIntArray773[i] & 0xffff);

		if(!flag)
			throw new NullPointerException();
		else
			return flag1;
	}

	public final Class46 method580(boolean flag)
	{
		if(!flag)
			throw new NullPointerException();
		int i = -1;
		if(anInt774 != -1)
		{
			Class37 class37 = Class37.aClass37Array646[anInt774];
			int j = class37.anInt648;
			int k = class37.anInt649;
			int l = class37.anInt650;
			int i1 = client.anIntArray1232[l - k];
			i = aClient765.anIntArray971[j] >> k & i1;
		} else
		if(anInt749 != -1)
			i = aClient765.anIntArray971[anInt749];
		if(i < 0 || i >= anIntArray759.length || anIntArray759[i] == -1)
			return null;
		else
			return method572(anIntArray759[i]);
	}

	private final Class30_Sub2_Sub4_Sub6 method581(int i, int j, int k, int l)
	{
		Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = null;
		long l1;
		if(anIntArray776 == null)
		{
			if(j != 10)
				return null;
			l1 = (long)((anInt754 << 6) + l) + ((long)(k + 1) << 32);
			Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = (Class30_Sub2_Sub4_Sub6)aClass12_780.method222(l1);
			if(class30_sub2_sub4_sub6_1 != null)
				return class30_sub2_sub4_sub6_1;
			if(anIntArray773 == null)
				return null;
			boolean flag1 = aBoolean751 ^ (l > 3);
			int k1 = anIntArray773.length;
			for(int i2 = 0; i2 < k1; i2++)
			{
				int l2 = anIntArray773[i2];
				if(flag1)
					l2 += 0x10000;
				class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_785.method222(l2);
				if(class30_sub2_sub4_sub6 == null)
				{
					class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt770, l2 & 0xffff);
					if(class30_sub2_sub4_sub6 == null)
						return null;
					if(flag1)
						class30_sub2_sub4_sub6.method477(0);
					aClass12_785.method223(class30_sub2_sub4_sub6, l2, (byte)2);
				}
				if(k1 > 1)
					aClass30_Sub2_Sub4_Sub6Array741[i2] = class30_sub2_sub4_sub6;
			}

			if(k1 > 1)
				class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(k1, aClass30_Sub2_Sub4_Sub6Array741, -38);
		} else
		{
			int i1 = -1;
			for(int j1 = 0; j1 < anIntArray776.length; j1++)
			{
				if(anIntArray776[j1] != j)
					continue;
				i1 = j1;
				break;
			}

			if(i1 == -1)
				return null;
			l1 = (long)((anInt754 << 6) + (i1 << 3) + l) + ((long)(k + 1) << 32);
			Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_2 = (Class30_Sub2_Sub4_Sub6)aClass12_780.method222(l1);
			if(class30_sub2_sub4_sub6_2 != null)
				return class30_sub2_sub4_sub6_2;
			int j2 = anIntArray773[i1];
			boolean flag3 = aBoolean751 ^ (l > 3);
			if(flag3)
				j2 += 0x10000;
			class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_785.method222(j2);
			if(class30_sub2_sub4_sub6 == null)
			{
				class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt770, j2 & 0xffff);
				if(class30_sub2_sub4_sub6 == null)
					return null;
				if(flag3)
					class30_sub2_sub4_sub6.method477(0);
				aClass12_785.method223(class30_sub2_sub4_sub6, j2, (byte)2);
			}
		}
		boolean flag;
		if(anInt748 != 128 || anInt772 != 128 || anInt740 != 128)
			flag = true;
		else
			flag = false;
		boolean flag2;
		if(anInt738 != 0 || anInt745 != 0 || anInt783 != 0)
			flag2 = true;
		else
			flag2 = false;
		Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_3 = new Class30_Sub2_Sub4_Sub6(9, anIntArray784 == null, Class36.method532(k, false), l == 0 && k == -1 && !flag && !flag2, class30_sub2_sub4_sub6);
		if(k != -1)
		{
			class30_sub2_sub4_sub6_3.method469((byte)-71);
			class30_sub2_sub4_sub6_3.method470(k, 40542);
			class30_sub2_sub4_sub6_3.anIntArrayArray1658 = null;
			class30_sub2_sub4_sub6_3.anIntArrayArray1657 = null;
		}
		while(l-- > 0) 
			class30_sub2_sub4_sub6_3.method473(360);
		if(anIntArray784 != null)
		{
			for(int k2 = 0; k2 < anIntArray784.length; k2++)
				class30_sub2_sub4_sub6_3.method476(anIntArray784[k2], anIntArray747[k2]);

		}
		if(flag)
			class30_sub2_sub4_sub6_3.method478(anInt748, anInt740, anInt743, anInt772);
		if(flag2)
			class30_sub2_sub4_sub6_3.method475(anInt738, anInt745, 16384, anInt783);
		class30_sub2_sub4_sub6_3.method479(64 + aByte737, 768 + aByte742 * 5, -50, -10, -50, !aBoolean769);
		if(anInt760 == 1)
			class30_sub2_sub4_sub6_3.anInt1654 = ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6_3)).anInt1426;
		aClass12_780.method223(class30_sub2_sub4_sub6_3, l1, (byte)2);
		if(i != 0)
			anInt743 = 422;
		return class30_sub2_sub4_sub6_3;
	}

	private final void method582(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
	{
		if(!flag){
//			anInt750 = 217;	//REMOVED due to it not being used anywhere except being set 4/20/17
		}
		int i = -1;
label0:
		do
		{
			int j;
			do
			{
				j = class30_sub2_sub2.method408();
				if(j == 0)
					break label0;
				if(j == 1)
				{
					int k = class30_sub2_sub2.method408();
					if(k > 0)
						if(anIntArray773 == null || aBoolean752)
						{
							anIntArray776 = new int[k];
							anIntArray773 = new int[k];
							for(int k1 = 0; k1 < k; k1++)
							{
								anIntArray773[k1] = class30_sub2_sub2.method410();
								anIntArray776[k1] = class30_sub2_sub2.method408();
							}

						} else
						{
							class30_sub2_sub2.anInt1406 += k * 3;
						}
				} else
				if(j == 2)
					aString739 = class30_sub2_sub2.method415();
				else
				if(j == 3)
					aByteArray777 = class30_sub2_sub2.method416((byte)30);
				else
				if(j == 5)
				{
					int l = class30_sub2_sub2.method408();
					if(l > 0)
						if(anIntArray773 == null || aBoolean752)
						{
							anIntArray776 = null;
							anIntArray773 = new int[l];
							for(int l1 = 0; l1 < l; l1++)
								anIntArray773[l1] = class30_sub2_sub2.method410();

						} else
						{
							class30_sub2_sub2.anInt1406 += l * 2;
						}
				} else
				if(j == 14)
					anInt744 = class30_sub2_sub2.method408();
				else
				if(j == 15)
					anInt761 = class30_sub2_sub2.method408();
				else
				if(j == 17)
					aBoolean767 = false;
				else
				if(j == 18)
					aBoolean757 = false;
				else
				if(j == 19)
				{
					i = class30_sub2_sub2.method408();
					if(i == 1)
						aBoolean778 = true;
				} else
				if(j == 21)
					aBoolean762 = true;
				else
				if(j == 22)
					aBoolean769 = true;
				else
				if(j == 23)
					aBoolean764 = true;
				else
				if(j == 24)
				{
					anInt781 = class30_sub2_sub2.method410();
					if(anInt781 == 65535)
						anInt781 = -1;
				} else
				if(j == 28)
					anInt775 = class30_sub2_sub2.method408();
				else
				if(j == 29)
					aByte737 = class30_sub2_sub2.method409();
				else
				if(j == 39)
					aByte742 = class30_sub2_sub2.method409();
				else
				if(j >= 30 && j < 39)
				{
					if(aStringArray786 == null)
						aStringArray786 = new String[5];
					aStringArray786[j - 30] = class30_sub2_sub2.method415();
					if(aStringArray786[j - 30].equalsIgnoreCase("hidden"))
						aStringArray786[j - 30] = null;
				} else
				if(j == 40)
				{
					int i1 = class30_sub2_sub2.method408();
					anIntArray784 = new int[i1];
					anIntArray747 = new int[i1];
					for(int i2 = 0; i2 < i1; i2++)
					{
						anIntArray784[i2] = class30_sub2_sub2.method410();
						anIntArray747[i2] = class30_sub2_sub2.method410();
					}

				} else
				if(j == 60)
					anInt746 = class30_sub2_sub2.method410();
				else
				if(j == 62)
					aBoolean751 = true;
				else
				if(j == 64)
					aBoolean779 = false;
				else
				if(j == 65)
					anInt748 = class30_sub2_sub2.method410();
				else
				if(j == 66)
					anInt772 = class30_sub2_sub2.method410();
				else
				if(j == 67)
					anInt740 = class30_sub2_sub2.method410();
				else
				if(j == 68)
					anInt758 = class30_sub2_sub2.method410();
				else
				if(j == 69)
					anInt768 = class30_sub2_sub2.method408();
				else
				if(j == 70)
					anInt738 = class30_sub2_sub2.method411();
				else
				if(j == 71)
					anInt745 = class30_sub2_sub2.method411();
				else
				if(j == 72)
					anInt783 = class30_sub2_sub2.method411();
				else
				if(j == 73)
					aBoolean736 = true;
				else
				if(j == 74)
				{
					aBoolean766 = true;
				} else
				{
					if(j != 75)
						continue;
					anInt760 = class30_sub2_sub2.method408();
				}
				continue label0;
			} while(j != 77);
			anInt774 = class30_sub2_sub2.method410();
			if(anInt774 == 65535)
				anInt774 = -1;
			anInt749 = class30_sub2_sub2.method410();
			if(anInt749 == 65535)
				anInt749 = -1;
			int j1 = class30_sub2_sub2.method408();
			anIntArray759 = new int[j1 + 1];
			for(int j2 = 0; j2 <= j1; j2++)
			{
				anIntArray759[j2] = class30_sub2_sub2.method410();
				if(anIntArray759[j2] == 65535)
					anIntArray759[j2] = -1;
			}

		} while(true);
		if(i == -1)
		{
			aBoolean778 = false;
			if(anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10))
				aBoolean778 = true;
			if(aStringArray786 != null)
				aBoolean778 = true;
		}
		if(aBoolean766)
		{
			aBoolean767 = false;
			aBoolean757 = false;
		}
		if(anInt760 == -1)
			anInt760 = aBoolean767 ? 1 : 0;
	}

	Class46()
	{
		anInt743 = 9;
		anInt754 = -1;
		aBoolean763 = true;
		anInt770 = 9;
	}

	public boolean aBoolean736;
	private byte aByte737;
	private int anInt738;
	public String aString739;
	private int anInt740;
	private static Class30_Sub2_Sub4_Sub6 aClass30_Sub2_Sub4_Sub6Array741[] = new Class30_Sub2_Sub4_Sub6[4];
	private byte aByte742;
	private int anInt743;
	public int anInt744;
	private int anInt745;
	public int anInt746;
	private int anIntArray747[];
	private int anInt748;
	public int anInt749;
//	private int anInt750;	//REMOVED Said its not used 4/20/17
	private boolean aBoolean751;
	public static boolean aBoolean752;
	private static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_753;
	public int anInt754;
	private static int anIntArray755[];
	private static int anInt756;
	public boolean aBoolean757;
	public int anInt758;
	public int anIntArray759[];
	public int anInt760;
	public int anInt761;
	public boolean aBoolean762;
	private boolean aBoolean763;
	public boolean aBoolean764;
	public static client aClient765;
	public boolean aBoolean766;
	public boolean aBoolean767;
	public int anInt768;
	private boolean aBoolean769;
	private int anInt770;
	private static int anInt771;
	private int anInt772;
	private int anIntArray773[];
	public int anInt774;
	public int anInt775;
	private int anIntArray776[];
	public byte aByteArray777[];
	public boolean aBoolean778;
	public boolean aBoolean779;
	public static Class12 aClass12_780 = new Class12(false, 30);
	public int anInt781;
	private static Class46 aClass46Array782[];
	private int anInt783;
	private int anIntArray784[];
	public static Class12 aClass12_785 = new Class12(false, 500);
	public String aStringArray786[];

}
