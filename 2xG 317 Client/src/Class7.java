/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7
{
	private static int anInt123 = (int) (Math.random() * 17.0) - 8;
	private int[] anIntArray124;
	private int[] anIntArray125;
	private int[] anIntArray126;
	private int[] anIntArray127;
	private int[] anIntArray128;
	private int[][][] anIntArrayArrayArray129;
	private byte[][][] aByteArrayArrayArray130;
	static int anInt131;
//	private boolean aBoolean132 = true;	//REMOVED Said its not used 4/20/17
	private static int anInt133 = (int) (Math.random() * 33.0) - 16;
	private byte[][][] aByteArrayArrayArray134;
	private int[][][] anIntArrayArrayArray135;
	private byte[][][] aByteArrayArrayArray136;
	private static final int[] anIntArray137 = { 1, 0, -1, 0 };
	private static int anInt138 = 323;
	private int[][] anIntArrayArray139;
	private static final int[] anIntArray140 = { 16, 32, 64, 128 };
	private static boolean aBoolean141;
	private byte[][][] aByteArrayArrayArray142;
	private boolean aBoolean143 = false;
	private static final int[] anIntArray144 = { 0, -1, 0, 1 };
	static int anInt145 = 99;
	private int anInt146;
	private int anInt147;
	private byte[][][] aByteArrayArrayArray148;
	private byte[][][] aByteArrayArrayArray149;
	private int anInt150 = -53;
	static boolean aBoolean151 = true;
	private static final int[] anIntArray152 = { 1, 2, 4, 8 };
//	private static int anInt153 = -388;	//REMOVED Said its not used 4/20/17
	
	public Class7(byte[][][] is, int i, int i_0_, int i_1_, int[][][] is_2_) {
	anInt145 = 99;
	anInt146 = i_1_;
	anInt147 = i_0_;
	while (i >= 0){
//		anInt153 = -320;	//REMOVED due to it not being used anywhere except being set 4/20/17
	}
	anIntArrayArrayArray129 = is_2_;
	aByteArrayArrayArray149 = is;
	aByteArrayArrayArray142 = new byte[4][anInt146][anInt147];
	aByteArrayArrayArray130 = new byte[4][anInt146][anInt147];
	aByteArrayArrayArray136 = new byte[4][anInt146][anInt147];
	aByteArrayArrayArray148 = new byte[4][anInt146][anInt147];
	anIntArrayArrayArray135 = new int[4][anInt146 + 1][anInt147 + 1];
	aByteArrayArrayArray134 = new byte[4][anInt146 + 1][anInt147 + 1];
	anIntArrayArray139 = new int[anInt146 + 1][anInt147 + 1];
	anIntArray124 = new int[anInt147];
	anIntArray125 = new int[anInt147];
	anIntArray126 = new int[anInt147];
	anIntArray127 = new int[anInt147];
	anIntArray128 = new int[anInt147];
	}
	
	private static final int method170(int i, int i_3_) {
	int i_4_ = i + i_3_ * 57;
	i_4_ = i_4_ << 13 ^ i_4_;
	int i_5_
		= i_4_ * (i_4_ * i_4_ * 15731 + 789221) + 1376312589 & 0x7fffffff;
	return i_5_ >> 19 & 0xff;
	}
	
	public final void method171(Class11[] class11s, Class25 class25, int i) {
	for (int i_6_ = 0; i_6_ < 4; i_6_++) {
		for (int i_7_ = 0; i_7_ < 104; i_7_++) {
		for (int i_8_ = 0; i_8_ < 104; i_8_++) {
			if ((aByteArrayArrayArray149[i_6_][i_7_][i_8_] & 0x1)
			== 1) {
			int i_9_ = i_6_;
			if ((aByteArrayArrayArray149[1][i_7_][i_8_] & 0x2)
				== 2)
				i_9_--;
			if (i_9_ >= 0)
				class11s[i_9_].method213(i_8_, 0, i_7_);
			}
		}
		}
	}
	if (i < 2 || i > 2)
		anInt138 = 329;
	anInt123 += (int) (Math.random() * 5.0) - 2;
	if (anInt123 < -8)
		anInt123 = -8;
	if (anInt123 > 8)
		anInt123 = 8;
	anInt133 += (int) (Math.random() * 5.0) - 2;
	if (anInt133 < -16)
		anInt133 = -16;
	if (anInt133 > 16)
		anInt133 = 16;
	for (int i_10_ = 0; i_10_ < 4; i_10_++) {
		byte[][] is = aByteArrayArrayArray134[i_10_];
		int i_11_ = 96;
		int i_12_ = 768;
		int i_13_ = -50;
		int i_14_ = -10;
		int i_15_ = -50;
		int i_16_ = (int) Math.sqrt((double) (i_13_ * i_13_ + i_14_ * i_14_
						  + i_15_ * i_15_));
		int i_17_ = i_12_ * i_16_ >> 8;
		for (int i_18_ = 1; i_18_ < anInt147 - 1; i_18_++) {
		for (int i_19_ = 1; i_19_ < anInt146 - 1; i_19_++) {
			int i_20_
			= (anIntArrayArrayArray129[i_10_][i_19_ + 1][i_18_]
			   - anIntArrayArrayArray129[i_10_][i_19_ - 1][i_18_]);
			int i_21_
			= (anIntArrayArrayArray129[i_10_][i_19_][i_18_ + 1]
			   - anIntArrayArrayArray129[i_10_][i_19_][i_18_ - 1]);
			int i_22_ = (int) Math.sqrt((double) (i_20_ * i_20_ + 65536
							  + i_21_ * i_21_));
			int i_23_ = (i_20_ << 8) / i_22_;
			int i_24_ = 65536 / i_22_;
			int i_25_ = (i_21_ << 8) / i_22_;
			int i_26_ = i_11_ + (i_13_ * i_23_ + i_14_ * i_24_
					 + i_15_ * i_25_) / i_17_;
			int i_27_ = ((is[i_19_ - 1][i_18_] >> 2)
				 + (is[i_19_ + 1][i_18_] >> 3)
				 + (is[i_19_][i_18_ - 1] >> 2)
				 + (is[i_19_][i_18_ + 1] >> 3)
				 + (is[i_19_][i_18_] >> 1));
			anIntArrayArray139[i_19_][i_18_] = i_26_ - i_27_;
		}
		}
		for (int i_28_ = 0; i_28_ < anInt147; i_28_++) {
		anIntArray124[i_28_] = 0;
		anIntArray125[i_28_] = 0;
		anIntArray126[i_28_] = 0;
		anIntArray127[i_28_] = 0;
		anIntArray128[i_28_] = 0;
		}
		for (int i_29_ = -5; i_29_ < anInt146 + 5; i_29_++) {
		for (int i_30_ = 0; i_30_ < anInt147; i_30_++) {
			int i_31_ = i_29_ + 5;
			if (i_31_ >= 0 && i_31_ < anInt146) {
			int i_32_
				= (aByteArrayArrayArray142[i_10_][i_31_][i_30_]
				   & 0xff);
			if (i_32_ > 0) {
				Class22 class22
				= Class22.aClass22Array388[i_32_ - 1];
				anIntArray124[i_30_] += class22.anInt397;
				anIntArray125[i_30_] += class22.anInt395;
				anIntArray126[i_30_] += class22.anInt396;
				anIntArray127[i_30_] += class22.anInt398;
				anIntArray128[i_30_]++;
			}
			}
			int i_33_ = i_29_ - 5;
			if (i_33_ >= 0 && i_33_ < anInt146) {
			int i_34_
				= (aByteArrayArrayArray142[i_10_][i_33_][i_30_]
				   & 0xff);
			if (i_34_ > 0) {
				Class22 class22
				= Class22.aClass22Array388[i_34_ - 1];
				anIntArray124[i_30_] -= class22.anInt397;
				anIntArray125[i_30_] -= class22.anInt395;
				anIntArray126[i_30_] -= class22.anInt396;
				anIntArray127[i_30_] -= class22.anInt398;
				anIntArray128[i_30_]--;
			}
			}
		}
		if (i_29_ >= 1 && i_29_ < anInt146 - 1) {
			int i_35_ = 0;
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = 0;
			int i_39_ = 0;
			for (int i_40_ = -5; i_40_ < anInt147 + 5; i_40_++) {
			int i_41_ = i_40_ + 5;
			if (i_41_ >= 0 && i_41_ < anInt147) {
				i_35_ += anIntArray124[i_41_];
				i_36_ += anIntArray125[i_41_];
				i_37_ += anIntArray126[i_41_];
				i_38_ += anIntArray127[i_41_];
				i_39_ += anIntArray128[i_41_];
			}
			int i_42_ = i_40_ - 5;
			if (i_42_ >= 0 && i_42_ < anInt147) {
				i_35_ -= anIntArray124[i_42_];
				i_36_ -= anIntArray125[i_42_];
				i_37_ -= anIntArray126[i_42_];
				i_38_ -= anIntArray127[i_42_];
				i_39_ -= anIntArray128[i_42_];
			}
			if (i_40_ >= 1 && i_40_ < anInt147 - 1
				&& (!aBoolean151
				|| (aByteArrayArrayArray149[0][i_29_][i_40_]
					& 0x2) != 0
				|| (((aByteArrayArrayArray149[i_10_][i_29_]
					  [i_40_])
					 & 0x10) == 0
					&& (method182(i_40_, i_10_, i_29_, 0)
					== anInt131)))) {
				if (i_10_ < anInt145)
				anInt145 = i_10_;
				int i_43_
				= (aByteArrayArrayArray142[i_10_][i_29_][i_40_]
				   & 0xff);
				int i_44_
				= (aByteArrayArrayArray130[i_10_][i_29_][i_40_]
				   & 0xff);
				if (i_43_ > 0 || i_44_ > 0) {
				int i_45_ = (anIntArrayArrayArray129[i_10_]
						 [i_29_][i_40_]);
				int i_46_ = (anIntArrayArrayArray129[i_10_]
						 [i_29_ + 1][i_40_]);
				int i_47_ = (anIntArrayArrayArray129[i_10_]
						 [i_29_ + 1][i_40_ + 1]);
				int i_48_ = (anIntArrayArrayArray129[i_10_]
						 [i_29_][i_40_ + 1]);
				int i_49_ = anIntArrayArray139[i_29_][i_40_];
				int i_50_
					= anIntArrayArray139[i_29_ + 1][i_40_];
				int i_51_
					= anIntArrayArray139[i_29_ + 1][i_40_ + 1];
				int i_52_
					= anIntArrayArray139[i_29_][i_40_ + 1];
				int i_53_ = -1;
				int i_54_ = -1;
				if (i_43_ > 0) {
					int i_55_ = i_35_ * 256 / i_38_;
					int i_56_ = i_36_ / i_39_;
					int i_57_ = i_37_ / i_39_;
					i_53_ = method177(i_55_, i_56_, i_57_);
					i_55_ = i_55_ + anInt123 & 0xff;
					i_57_ += anInt133;
					if (i_57_ < 0)
					i_57_ = 0;
					else if (i_57_ > 255)
					i_57_ = 255;
					i_54_ = method177(i_55_, i_56_, i_57_);
				}
				if (i_10_ > 0) {
					boolean bool = true;
					if (i_43_ == 0
					&& (aByteArrayArrayArray136[i_10_]
						[i_29_][i_40_]) != 0)
					bool = false;
					if (i_44_ > 0
					&& !(Class22.aClass22Array388
						 [i_44_ - 1].aBoolean393))
					bool = false;
					if (bool && i_45_ == i_46_
					&& i_45_ == i_47_ && i_45_ == i_48_)
					anIntArrayArrayArray135[i_10_]
						[i_29_][i_40_]
						|= 0x924;
				}
				int i_58_ = 0;
				if (i_53_ != -1)
					i_58_ = (Class30_Sub2_Sub1_Sub3
						 .anIntArray1482
						 [method187(i_54_, 96)]);
				if (i_44_ == 0)
					class25.method279(i_10_, i_29_, i_40_, 0,
							  0, -1, i_45_, i_46_,
							  i_47_, i_48_,
							  method187(i_53_, i_49_),
							  method187(i_53_, i_50_),
							  method187(i_53_, i_51_),
							  method187(i_53_, i_52_),
							  0, 0, 0, 0, i_58_, 0);
				else {
					int i_59_ = ((aByteArrayArrayArray136
						  [i_10_][i_29_][i_40_])
						 + 1);
					byte i_60_ = (aByteArrayArrayArray148
						  [i_10_][i_29_][i_40_]);
					Class22 class22
					= Class22.aClass22Array388[i_44_ - 1];
					int i_61_ = class22.anInt391;
					int i_62_;
					int i_63_;
					if (i_61_ >= 0) {
					i_62_ = Class30_Sub2_Sub1_Sub3
							.method369(i_61_, 12660);
					i_63_ = -1;
					} else if (class22.anInt390 == 16711935) {
					i_62_ = 0;
					i_63_ = -2;
					i_61_ = -1;
					} else {
					i_63_ = method177(class22.anInt394,
							  class22.anInt395,
							  class22.anInt396);
					i_62_ = (Class30_Sub2_Sub1_Sub3
						 .anIntArray1482
						 [method185(class22.anInt399,
								96)]);
					}
					class25.method279(i_10_, i_29_, i_40_,
							  i_59_, i_60_, i_61_,
							  i_45_, i_46_, i_47_,
							  i_48_,
							  method187(i_53_, i_49_),
							  method187(i_53_, i_50_),
							  method187(i_53_, i_51_),
							  method187(i_53_, i_52_),
							  method185(i_63_, i_49_),
							  method185(i_63_, i_50_),
							  method185(i_63_, i_51_),
							  method185(i_63_, i_52_),
							  i_58_, i_62_);
				}
				}
			}
			}
		}
		}
		for (int i_64_ = 1; i_64_ < anInt147 - 1; i_64_++) {
		for (int i_65_ = 1; i_65_ < anInt146 - 1; i_65_++)
			class25.method278(i_10_, i_65_, i_64_,
					  method182(i_64_, i_10_, i_65_, 0));
		}
	}
	class25.method305(-10, (byte) 3, 64, -50, 768, -50);
	for (int i_66_ = 0; i_66_ < anInt146; i_66_++) {
		for (int i_67_ = 0; i_67_ < anInt147; i_67_++) {
		if ((aByteArrayArrayArray149[1][i_66_][i_67_] & 0x2) == 2)
			class25.method276(i_67_, i_66_, -438);
		}
	}
	int i_68_ = 1;
	int i_69_ = 2;
	int i_70_ = 4;
	for (int i_71_ = 0; i_71_ < 4; i_71_++) {
		if (i_71_ > 0) {
		i_68_ <<= 3;
		i_69_ <<= 3;
		i_70_ <<= 3;
		}
		for (int i_72_ = 0; i_72_ <= i_71_; i_72_++) {
		for (int i_73_ = 0; i_73_ <= anInt147; i_73_++) {
			for (int i_74_ = 0; i_74_ <= anInt146; i_74_++) {
			if ((anIntArrayArrayArray135[i_72_][i_74_][i_73_]
				 & i_68_)
				!= 0) {
				int i_75_ = i_73_;
				int i_76_ = i_73_;
				int i_77_ = i_72_;
				int i_78_ = i_72_;
				for (/**/; i_75_ > 0; i_75_--) {
				if (((anIntArrayArrayArray135[i_72_][i_74_]
					  [i_75_ - 1])
					 & i_68_)
					== 0)
					break;
				}
				for (/**/; i_76_ < anInt147; i_76_++) {
				if (((anIntArrayArrayArray135[i_72_][i_74_]
					  [i_76_ + 1])
					 & i_68_)
					== 0)
					break;
				}
			while_6_:
				for (/**/; i_77_ > 0; i_77_--) {
				for (int i_79_ = i_75_; i_79_ <= i_76_;
					 i_79_++) {
					if (((anIntArrayArrayArray135[i_77_ - 1]
					  [i_74_][i_79_])
					 & i_68_)
					== 0)
					break while_6_;
				}
				}
			while_7_:
				for (/**/; i_78_ < i_71_; i_78_++) {
				for (int i_80_ = i_75_; i_80_ <= i_76_;
					 i_80_++) {
					if (((anIntArrayArrayArray135[i_78_ + 1]
					  [i_74_][i_80_])
					 & i_68_)
					== 0)
					break while_7_;
				}
				}
				int i_81_
				= (i_78_ + 1 - i_77_) * (i_76_ - i_75_ + 1);
				if (i_81_ >= 8) {
				int i_82_ = 240;
				int i_83_ = ((anIntArrayArrayArray129[i_78_]
						  [i_74_][i_75_])
						 - i_82_);
				int i_84_ = (anIntArrayArrayArray129[i_77_]
						 [i_74_][i_75_]);
				Class25.method277(i_71_, i_74_ * 128, i_84_,
						  i_74_ * 128,
						  i_76_ * 128 + 128, i_83_,
						  anInt150, i_75_ * 128, 1);
				for (int i_85_ = i_77_; i_85_ <= i_78_;
					 i_85_++) {
					for (int i_86_ = i_75_; i_86_ <= i_76_;
					 i_86_++)
					anIntArrayArrayArray135[i_85_]
						[i_74_][i_86_]
						&= i_68_ ^ 0xffffffff;
				}
				}
			}
			if ((anIntArrayArrayArray135[i_72_][i_74_][i_73_]
				 & i_69_)
				!= 0) {
				int i_87_ = i_74_;
				int i_88_ = i_74_;
				int i_89_ = i_72_;
				int i_90_ = i_72_;
				for (/**/; i_87_ > 0; i_87_--) {
				if (((anIntArrayArrayArray135[i_72_][i_87_ - 1]
					  [i_73_])
					 & i_69_)
					== 0)
					break;
				}
				for (/**/; i_88_ < anInt146; i_88_++) {
				if (((anIntArrayArrayArray135[i_72_][i_88_ + 1]
					  [i_73_])
					 & i_69_)
					== 0)
					break;
				}
			while_8_:
				for (/**/; i_89_ > 0; i_89_--) {
				for (int i_91_ = i_87_; i_91_ <= i_88_;
					 i_91_++) {
					if (((anIntArrayArrayArray135[i_89_ - 1]
					  [i_91_][i_73_])
					 & i_69_)
					== 0)
					break while_8_;
				}
				}
			while_9_:
				for (/**/; i_90_ < i_71_; i_90_++) {
				for (int i_92_ = i_87_; i_92_ <= i_88_;
					 i_92_++) {
					if (((anIntArrayArrayArray135[i_90_ + 1]
					  [i_92_][i_73_])
					 & i_69_)
					== 0)
					break while_9_;
				}
				}
				int i_93_
				= (i_90_ + 1 - i_89_) * (i_88_ - i_87_ + 1);
				if (i_93_ >= 8) {
				int i_94_ = 240;
				int i_95_ = ((anIntArrayArrayArray129[i_90_]
						  [i_87_][i_73_])
						 - i_94_);
				int i_96_ = (anIntArrayArrayArray129[i_89_]
						 [i_87_][i_73_]);
				Class25.method277(i_71_, i_87_ * 128, i_96_,
						  i_88_ * 128 + 128,
						  i_73_ * 128, i_95_, anInt150,
						  i_73_ * 128, 2);
				for (int i_97_ = i_89_; i_97_ <= i_90_;
					 i_97_++) {
					for (int i_98_ = i_87_; i_98_ <= i_88_;
					 i_98_++)
					anIntArrayArrayArray135[i_97_]
						[i_98_][i_73_]
						&= i_69_ ^ 0xffffffff;
				}
				}
			}
			if ((anIntArrayArrayArray135[i_72_][i_74_][i_73_]
				 & i_70_)
				!= 0) {
				int i_99_ = i_74_;
				int i_100_ = i_74_;
				int i_101_ = i_73_;
				int i_102_ = i_73_;
				for (/**/; i_101_ > 0; i_101_--) {
				if (((anIntArrayArrayArray135[i_72_][i_74_]
					  [i_101_ - 1])
					 & i_70_)
					== 0)
					break;
				}
				for (/**/; i_102_ < anInt147; i_102_++) {
				if (((anIntArrayArrayArray135[i_72_][i_74_]
					  [i_102_ + 1])
					 & i_70_)
					== 0)
					break;
				}
			while_10_:
				for (/**/; i_99_ > 0; i_99_--) {
				for (int i_103_ = i_101_; i_103_ <= i_102_;
					 i_103_++) {
					if (((anIntArrayArrayArray135[i_72_]
					  [i_99_ - 1][i_103_])
					 & i_70_)
					== 0)
					break while_10_;
				}
				}
			while_11_:
				for (/**/; i_100_ < anInt146; i_100_++) {
				for (int i_104_ = i_101_; i_104_ <= i_102_;
					 i_104_++) {
					if (((anIntArrayArrayArray135[i_72_]
					  [i_100_ + 1][i_104_])
					 & i_70_)
					== 0)
					break while_11_;
				}
				}
				if ((i_100_ - i_99_ + 1) * (i_102_ - i_101_ + 1)
				>= 4) {
				int i_105_ = (anIntArrayArrayArray129[i_72_]
						  [i_99_][i_101_]);
				Class25.method277(i_71_, i_99_ * 128, i_105_,
						  i_100_ * 128 + 128,
						  i_102_ * 128 + 128, i_105_,
						  anInt150, i_101_ * 128, 4);
				for (int i_106_ = i_99_; i_106_ <= i_100_;
					 i_106_++) {
					for (int i_107_ = i_101_; i_107_ <= i_102_;
					 i_107_++)
					anIntArrayArrayArray135[i_72_]
						[i_106_][i_107_]
						&= i_70_ ^ 0xffffffff;
				}
				}
			}
			}
		}
		}
	}
	}
	
	private static final int method172(int i, int i_108_) {
	int i_109_ = (method176(i + 45365, i_108_ + 91923, 4) - 128
			  + (method176(i + 10294, i_108_ + 37821, 2) - 128 >> 1)
			  + (method176(i, i_108_, 1) - 128 >> 2));
	i_109_ = (int) ((double) i_109_ * 0.3) + 35;
	if (i_109_ < 10)
		i_109_ = 10;
	else if (i_109_ > 60)
		i_109_ = 60;
	return i_109_;
	}
	
	public static final void method173(byte i,
					   Class30_Sub2_Sub2 class30_sub2_sub2,
					   Class42_Sub1 class42_sub1) {
	int i_110_ = -1;
	if (i != -107)
		aBoolean141 = !aBoolean141;
	for (;;) {
		int i_111_ = class30_sub2_sub2.method422();
		if (i_111_ == 0)
		break;
		i_110_ += i_111_;
		Class46 class46 = Class46.method572(i_110_);
		class46.method574(class42_sub1, -235);
		for (;;) {
		int i_112_ = class30_sub2_sub2.method422();
		if (i_112_ == 0)
			break;
		class30_sub2_sub2.method408();
		}
	}
	}
	
	public final void method174(int i, int i_113_, int i_114_, int i_115_,
				int i_116_) {
	for (int i_117_ = i; i_117_ <= i + i_113_; i_117_++) {
		for (int i_118_ = i_116_; i_118_ <= i_116_ + i_115_; i_118_++) {
		if (i_118_ >= 0 && i_118_ < anInt146 && i_117_ >= 0
			&& i_117_ < anInt147) {
			aByteArrayArrayArray134[0][i_118_][i_117_] = (byte) 127;
			if (i_118_ == i_116_ && i_118_ > 0)
			anIntArrayArrayArray129[0][i_118_][i_117_]
				= anIntArrayArrayArray129[0][i_118_ - 1][i_117_];
			if (i_118_ == i_116_ + i_115_ && i_118_ < anInt146 - 1)
			anIntArrayArrayArray129[0][i_118_][i_117_]
				= anIntArrayArrayArray129[0][i_118_ + 1][i_117_];
			if (i_117_ == i && i_117_ > 0)
			anIntArrayArrayArray129[0][i_118_][i_117_]
				= anIntArrayArrayArray129[0][i_118_][i_117_ - 1];
			if (i_117_ == i + i_113_ && i_117_ < anInt147 - 1)
			anIntArrayArrayArray129[0][i_118_][i_117_]
				= anIntArrayArrayArray129[0][i_118_][i_117_ + 1];
		}
		}
	}
	if (i_114_ != 0){
//		anInt153 = 284;	//REMOVED due to it not being used anywhere except being set 4/20/17
	}
	}
	
	private final void method175(int i, Class25 class25, Class11 class11,
				 int i_119_, int i_120_, int i_121_,
				 int i_122_, boolean bool, int i_123_) {
	if (!aBoolean151 || (aByteArrayArrayArray149[0][i_121_][i] & 0x2) != 0
		|| ((aByteArrayArrayArray149[i_120_][i_121_][i] & 0x10) == 0
		&& method182(i, i_120_, i_121_, 0) == anInt131)) {
		if (i_120_ < anInt145)
		anInt145 = i_120_;
		int i_124_ = anIntArrayArrayArray129[i_120_][i_121_][i];
		int i_125_ = anIntArrayArrayArray129[i_120_][i_121_ + 1][i];
		int i_126_ = anIntArrayArrayArray129[i_120_][i_121_ + 1][i + 1];
		int i_127_ = anIntArrayArrayArray129[i_120_][i_121_][i + 1];
		int i_128_ = i_124_ + i_125_ + i_126_ + i_127_ >> 2;
		Class46 class46 = Class46.method572(i_122_);
		int i_129_ = i_121_ + (i << 7) + (i_122_ << 14) + 1073741824;
		if (!class46.aBoolean778)
		i_129_ += -2147483648;
		byte i_130_ = (byte) ((i_123_ << 6) + i_119_);
		if (!bool) {
		if (i_119_ == 22) {
			if (!aBoolean151 || class46.aBoolean778
			|| class46.aBoolean736) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(22, i_123_, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_,
								 22, i_125_,
								 (byte) 7, i_126_,
								 i_124_, i_127_,
								 class46.anInt781,
								 true);
			class25.method280(i_120_, i_128_, i, 68,
					  class30_sub2_sub4, i_130_, i_129_,
					  i_121_);
			if (class46.aBoolean767 && class46.aBoolean778
				&& class11 != null)
				class11.method213(i, 0, i_121_);
			}
		} else if (i_119_ == 10 || i_119_ == 11) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(10, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_, 10,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			if (class30_sub2_sub4 != null) {
			int i_131_ = 0;
			if (i_119_ == 11)
				i_131_ += 256;
			int i_132_;
			int i_133_;
			if (i_123_ == 1 || i_123_ == 3) {
				i_132_ = class46.anInt761;
				i_133_ = class46.anInt744;
			} else {
				i_132_ = class46.anInt744;
				i_133_ = class46.anInt761;
			}
			if (class25.method284(i_129_, i_130_, i_128_, i_133_,
						  class30_sub2_sub4, i_132_,
						  i_120_, i_131_, (byte) 110, i,
						  i_121_)
				&& class46.aBoolean779) {
				Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
				if (class30_sub2_sub4
				instanceof Class30_Sub2_Sub4_Sub6)
				class30_sub2_sub4_sub6
					= ((Class30_Sub2_Sub4_Sub6)
					   class30_sub2_sub4);
				else
				class30_sub2_sub4_sub6
					= class46.method578(10, i_123_, i_124_,
							i_125_, i_126_, i_127_,
							-1);
				if (class30_sub2_sub4_sub6 != null) {
				for (int i_134_ = 0; i_134_ <= i_132_;
					 i_134_++) {
					for (int i_135_ = 0; i_135_ <= i_133_;
					 i_135_++) {
					int i_136_
						= (class30_sub2_sub4_sub6.anInt1650
						   / 4);
					if (i_136_ > 30)
						i_136_ = 30;
					if (i_136_
						> (aByteArrayArrayArray134[i_120_]
						   [i_121_ + i_134_][i + i_135_]))
						aByteArrayArrayArray134[i_120_]
						[i_121_ + i_134_][i + i_135_]
						= (byte) i_136_;
					}
				}
				}
			}
			}
			if (class46.aBoolean767 && class11 != null)
			class11.method212(class46.aBoolean757, anInt138,
					  class46.anInt744, class46.anInt761,
					  i_121_, i, i_123_);
		} else if (i_119_ >= 12) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(i_119_, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_,
							 i_119_, i_125_,
							 (byte) 7, i_126_,
							 i_124_, i_127_,
							 class46.anInt781,
							 true);
			class25.method284(i_129_, i_130_, i_128_, 1,
					  class30_sub2_sub4, 1, i_120_, 0,
					  (byte) 110, i, i_121_);
			if (i_119_ >= 12 && i_119_ <= 17 && i_119_ != 13
			&& i_120_ > 0)
			anIntArrayArrayArray135[i_120_][i_121_][i] |= 0x924;
			if (class46.aBoolean767 && class11 != null)
			class11.method212(class46.aBoolean757, anInt138,
					  class46.anInt744, class46.anInt761,
					  i_121_, i, i_123_);
		} else if (i_119_ == 0) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(0, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_, 0,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			class25.method282(anIntArray152[i_123_], class30_sub2_sub4,
					  true, i_129_, i, i_130_, i_121_, null,
					  i_128_, 0, i_120_);
			if (i_123_ == 0) {
			if (class46.aBoolean779) {
				aByteArrayArrayArray134[i_120_][i_121_][i]
				= (byte) 50;
				aByteArrayArrayArray134[i_120_][i_121_][i + 1]
				= (byte) 50;
			}
			if (class46.aBoolean764)
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x249;
			} else if (i_123_ == 1) {
			if (class46.aBoolean779) {
				aByteArrayArrayArray134[i_120_][i_121_][i + 1]
				= (byte) 50;
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i + 1]
				= (byte) 50;
			}
			if (class46.aBoolean764)
				anIntArrayArrayArray135[i_120_][i_121_][i + 1]
				|= 0x492;
			} else if (i_123_ == 2) {
			if (class46.aBoolean779) {
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i]
				= (byte) 50;
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i + 1]
				= (byte) 50;
			}
			if (class46.aBoolean764)
				anIntArrayArrayArray135[i_120_][i_121_ + 1][i]
				|= 0x249;
			} else if (i_123_ == 3) {
			if (class46.aBoolean779) {
				aByteArrayArrayArray134[i_120_][i_121_][i]
				= (byte) 50;
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i]
				= (byte) 50;
			}
			if (class46.aBoolean764)
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x492;
			}
			if (class46.aBoolean767 && class11 != null)
			class11.method211(i, i_123_, i_121_, i_119_, (byte) 1,
					  class46.aBoolean757);
			if (class46.anInt775 != 16)
			class25.method290(i, 441, class46.anInt775, i_121_,
					  i_120_);
		} else if (i_119_ == 1) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(1, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_, 1,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			class25.method282(anIntArray140[i_123_], class30_sub2_sub4,
					  true, i_129_, i, i_130_, i_121_, null,
					  i_128_, 0, i_120_);
			if (class46.aBoolean779) {
			if (i_123_ == 0)
				aByteArrayArrayArray134[i_120_][i_121_][i + 1]
				= (byte) 50;
			else if (i_123_ == 1)
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i + 1]
				= (byte) 50;
			else if (i_123_ == 2)
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i]
				= (byte) 50;
			else if (i_123_ == 3)
				aByteArrayArrayArray134[i_120_][i_121_][i]
				= (byte) 50;
			}
			if (class46.aBoolean767 && class11 != null)
			class11.method211(i, i_123_, i_121_, i_119_, (byte) 1,
					  class46.aBoolean757);
		} else if (i_119_ == 2) {
			int i_137_ = i_123_ + 1 & 0x3;
			Class30_Sub2_Sub4 class30_sub2_sub4;
			Class30_Sub2_Sub4 class30_sub2_sub4_138_;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null) {
			class30_sub2_sub4
				= class46.method578(2, 4 + i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			class30_sub2_sub4_138_
				= class46.method578(2, i_137_, i_124_, i_125_,
						i_126_, i_127_, -1);
			} else {
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 4 + i_123_, 2,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			class30_sub2_sub4_138_
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_137_, 2,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			}
			class25.method282(anIntArray152[i_123_], class30_sub2_sub4,
					  true, i_129_, i, i_130_, i_121_,
					  class30_sub2_sub4_138_, i_128_,
					  anIntArray152[i_137_], i_120_);
			if (class46.aBoolean764) {
			if (i_123_ == 0) {
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x249;
				anIntArrayArrayArray135[i_120_][i_121_][i + 1]
				|= 0x492;
			} else if (i_123_ == 1) {
				anIntArrayArrayArray135[i_120_][i_121_][i + 1]
				|= 0x492;
				anIntArrayArrayArray135[i_120_][i_121_ + 1][i]
				|= 0x249;
			} else if (i_123_ == 2) {
				anIntArrayArrayArray135[i_120_][i_121_ + 1][i]
				|= 0x249;
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x492;
			} else if (i_123_ == 3) {
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x492;
				anIntArrayArrayArray135[i_120_][i_121_][i]
				|= 0x249;
			}
			}
			if (class46.aBoolean767 && class11 != null)
			class11.method211(i, i_123_, i_121_, i_119_, (byte) 1,
					  class46.aBoolean757);
			if (class46.anInt775 != 16)
			class25.method290(i, 441, class46.anInt775, i_121_,
					  i_120_);
		} else if (i_119_ == 3) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(3, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_, 3,
							 i_125_, (byte) 7,
							 i_126_, i_124_,
							 i_127_,
							 class46.anInt781,
							 true);
			class25.method282(anIntArray140[i_123_], class30_sub2_sub4,
					  true, i_129_, i, i_130_, i_121_, null,
					  i_128_, 0, i_120_);
			if (class46.aBoolean779) {
			if (i_123_ == 0)
				aByteArrayArrayArray134[i_120_][i_121_][i + 1]
				= (byte) 50;
			else if (i_123_ == 1)
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i + 1]
				= (byte) 50;
			else if (i_123_ == 2)
				aByteArrayArrayArray134[i_120_][i_121_ + 1][i]
				= (byte) 50;
			else if (i_123_ == 3)
				aByteArrayArrayArray134[i_120_][i_121_][i]
				= (byte) 50;
			}
			if (class46.aBoolean767 && class11 != null)
			class11.method211(i, i_123_, i_121_, i_119_, (byte) 1,
					  class46.aBoolean757);
		} else if (i_119_ == 9) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
			&& class46.anIntArray759 == null)
			class30_sub2_sub4
				= class46.method578(i_119_, i_123_, i_124_, i_125_,
						i_126_, i_127_, -1);
			else
			class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, i_123_,
							 i_119_, i_125_,
							 (byte) 7, i_126_,
							 i_124_, i_127_,
							 class46.anInt781,
							 true);
			class25.method284(i_129_, i_130_, i_128_, 1,
					  class30_sub2_sub4, 1, i_120_, 0,
					  (byte) 110, i, i_121_);
			if (class46.aBoolean767 && class11 != null)
			class11.method212(class46.aBoolean757, anInt138,
					  class46.anInt744, class46.anInt761,
					  i_121_, i, i_123_);
		} else {
			if (class46.aBoolean762) {
			if (i_123_ == 1) {
				int i_139_ = i_127_;
				i_127_ = i_126_;
				i_126_ = i_125_;
				i_125_ = i_124_;
				i_124_ = i_139_;
			} else if (i_123_ == 2) {
				int i_140_ = i_127_;
				i_127_ = i_125_;
				i_125_ = i_140_;
				i_140_ = i_126_;
				i_126_ = i_124_;
				i_124_ = i_140_;
			} else if (i_123_ == 3) {
				int i_141_ = i_127_;
				i_127_ = i_124_;
				i_124_ = i_125_;
				i_125_ = i_126_;
				i_126_ = i_141_;
			}
			}
			if (i_119_ == 4) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(4, 0, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 0, 4,
								 i_125_, (byte) 7,
								 i_126_, i_124_,
								 i_127_,
								 class46.anInt781,
								 true);
			class25.method283(i_129_, i, i_123_ * 512, -460,
					  i_120_, 0, i_128_, class30_sub2_sub4,
					  i_121_, i_130_, 0,
					  anIntArray152[i_123_]);
			} else if (i_119_ == 5) {
			int i_142_ = 16;
			int i_143_ = class25.method300(i_120_, i_121_, i);
			if (i_143_ > 0)
				i_142_ = (Class46.method572(i_143_ >> 14 & 0x7fff)
					  .anInt775);
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(4, 0, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 0, 4,
								 i_125_, (byte) 7,
								 i_126_, i_124_,
								 i_127_,
								 class46.anInt781,
								 true);
			class25.method283(i_129_, i, i_123_ * 512, -460,
					  i_120_,
					  anIntArray137[i_123_] * i_142_,
					  i_128_, class30_sub2_sub4, i_121_,
					  i_130_,
					  anIntArray144[i_123_] * i_142_,
					  anIntArray152[i_123_]);
			} else if (i_119_ == 6) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(4, 0, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 0, 4,
								 i_125_, (byte) 7,
								 i_126_, i_124_,
								 i_127_,
								 class46.anInt781,
								 true);
			class25.method283(i_129_, i, i_123_, -460, i_120_, 0,
					  i_128_, class30_sub2_sub4, i_121_,
					  i_130_, 0, 256);
			} else if (i_119_ == 7) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(4, 0, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 0, 4,
								 i_125_, (byte) 7,
								 i_126_, i_124_,
								 i_127_,
								 class46.anInt781,
								 true);
			class25.method283(i_129_, i, i_123_, -460, i_120_, 0,
					  i_128_, class30_sub2_sub4, i_121_,
					  i_130_, 0, 512);
			} else if (i_119_ == 8) {
			Class30_Sub2_Sub4 class30_sub2_sub4;
			if (class46.anInt781 == -1
				&& class46.anIntArray759 == null)
				class30_sub2_sub4
				= class46.method578(4, 0, i_124_, i_125_,
							i_126_, i_127_, -1);
			else
				class30_sub2_sub4
				= new Class30_Sub2_Sub4_Sub5(i_122_, 0, 4,
								 i_125_, (byte) 7,
								 i_126_, i_124_,
								 i_127_,
								 class46.anInt781,
								 true);
			class25.method283(i_129_, i, i_123_, -460, i_120_, 0,
					  i_128_, class30_sub2_sub4, i_121_,
					  i_130_, 0, 768);
			}
		}
		}
	}
	}
	
	private static final int method176(int i, int i_144_, int i_145_) {
	int i_146_ = i / i_145_;
	int i_147_ = i & i_145_ - 1;
	int i_148_ = i_144_ / i_145_;
	int i_149_ = i_144_ & i_145_ - 1;
	int i_150_ = method186(i_146_, i_148_);
	int i_151_ = method186(i_146_ + 1, i_148_);
	int i_152_ = method186(i_146_, i_148_ + 1);
	int i_153_ = method186(i_146_ + 1, i_148_ + 1);
	int i_154_ = method184(i_150_, i_151_, i_147_, i_145_);
	int i_155_ = method184(i_152_, i_153_, i_147_, i_145_);
	return method184(i_154_, i_155_, i_149_, i_145_);
	}
	
	private final int method177(int i, int i_156_, int i_157_) {
	if (i_157_ > 179)
		i_156_ /= 2;
	if (i_157_ > 192)
		i_156_ /= 2;
	if (i_157_ > 217)
		i_156_ /= 2;
	if (i_157_ > 243)
		i_156_ /= 2;
	int i_158_ = (i / 4 << 10) + (i_156_ / 32 << 7) + i_157_ / 2;
	return i_158_;
	}
	
	public static final boolean method178(int i, int i_159_, int i_160_) {
	Class46 class46 = Class46.method572(i);
	if (i_160_ != 8) {
		for (int i_161_ = 1; i_161_ > 0; i_161_++) {
		/* empty */
		}
	}
	if (i_159_ == 11)
		i_159_ = 10;
	if (i_159_ >= 5 && i_159_ <= 8)
		i_159_ = 4;
	return class46.method577(i_159_, true);
	}
	
	public final void method179(int i, int i_162_, Class11[] class11s,
				int i_163_, int i_164_, int i_165_, byte[] is,
				int i_166_, int i_167_, int i_168_) {
	for (int i_169_ = 0; i_169_ < 8; i_169_++) {
		for (int i_170_ = 0; i_170_ < 8; i_170_++) {
		if (i_164_ + i_169_ > 0 && i_164_ + i_169_ < 103
			&& i_168_ + i_170_ > 0 && i_168_ + i_170_ < 103)
			class11s[i_167_].anIntArrayArray294[i_164_ + i_169_]
			[i_168_ + i_170_]
			&= ~0x1000000;
		}
	}
	if (i_163_ < 9 || i_163_ > 9) {
		for (int i_171_ = 1; i_171_ > 0; i_171_++) {
		/* empty */
		}
	}
	Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(is, 891);
	for (int i_172_ = 0; i_172_ < 4; i_172_++) {
		for (int i_173_ = 0; i_173_ < 64; i_173_++) {
		for (int i_174_ = 0; i_174_ < 64; i_174_++) {
			if (i_172_ == i && i_173_ >= i_165_ && i_173_ < i_165_ + 8
			&& i_174_ >= i_166_ && i_174_ < i_166_ + 8)
			method181(i_168_ + Class4.method156(i_174_ & 0x7,
								i_162_, -383,
								i_173_ & 0x7),
				  0, class30_sub2_sub2,
				  (i_164_
				   + Class4.method155(i_162_, i_174_ & 0x7,
							  i_173_ & 0x7, false)),
				  i_167_, i_162_, 942, 0);
			else
			method181(-1, 0, class30_sub2_sub2, -1, 0, 0, 942, 0);
		}
		}
	}
	}
	
	public final void method180(byte[] is, int i, int i_175_, int i_176_,
				int i_177_, byte i_178_, Class11[] class11s) {
	for (int i_179_ = 0; i_179_ < 4; i_179_++) {
		for (int i_180_ = 0; i_180_ < 64; i_180_++) {
		for (int i_181_ = 0; i_181_ < 64; i_181_++) {
			if (i_175_ + i_180_ > 0 && i_175_ + i_180_ < 103
			&& i + i_181_ > 0 && i + i_181_ < 103)
			class11s[i_179_].anIntArrayArray294
				[i_175_ + i_180_][i + i_181_]
				&= ~0x1000000;
		}
		}
	}
	Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(is, 891);
	for (int i_182_ = 0; i_182_ < 4; i_182_++) {
		for (int i_183_ = 0; i_183_ < 64; i_183_++) {
		for (int i_184_ = 0; i_184_ < 64; i_184_++)
			method181(i_184_ + i, i_177_, class30_sub2_sub2,
				  i_183_ + i_175_, i_182_, 0, 942, i_176_);
		}
	}
	if (i_178_ != 4)
		aBoolean143 = !aBoolean143;
	}
	
	private final void method181
	(int i, int i_185_, Class30_Sub2_Sub2 class30_sub2_sub2, int i_186_,
	 int i_187_, int i_188_, int i_189_, int i_190_) {
	i_189_ = 36 / i_189_;
	if (i_186_ >= 0 && i_186_ < 104 && i >= 0 && i < 104) {
		aByteArrayArrayArray149[i_187_][i_186_][i] = (byte) 0;
		for (;;) {
		int i_191_ = class30_sub2_sub2.method408();
		if (i_191_ == 0) {
			if (i_187_ == 0)
			anIntArrayArrayArray129[0][i_186_][i]
				= -method172(932731 + i_186_ + i_190_,
					 556238 + i + i_185_) * 8;
			else {
			anIntArrayArrayArray129[i_187_][i_186_][i]
				= (anIntArrayArrayArray129[i_187_ - 1][i_186_][i]
				   - 240);
			break;
			}
			break;
		}
		if (i_191_ == 1) {
			int i_192_ = class30_sub2_sub2.method408();
			if (i_192_ == 1)
			i_192_ = 0;
			if (i_187_ == 0)
			anIntArrayArrayArray129[0][i_186_][i] = -i_192_ * 8;
			else {
			anIntArrayArrayArray129[i_187_][i_186_][i]
				= (anIntArrayArrayArray129[i_187_ - 1][i_186_][i]
				   - i_192_ * 8);
			break;
			}
			break;
		}
		if (i_191_ <= 49) {
			aByteArrayArrayArray130[i_187_][i_186_][i]
			= class30_sub2_sub2.method409();
			aByteArrayArrayArray136[i_187_][i_186_][i]
			= (byte) ((i_191_ - 2) / 4);
			aByteArrayArrayArray148[i_187_][i_186_][i]
			= (byte) (i_191_ - 2 + i_188_ & 0x3);
		} else if (i_191_ <= 81)
			aByteArrayArrayArray149[i_187_][i_186_][i]
			= (byte) (i_191_ - 49);
		else
			aByteArrayArrayArray142[i_187_][i_186_][i]
			= (byte) (i_191_ - 81);
		}
	} else {
		for (;;) {
		int i_193_ = class30_sub2_sub2.method408();
		if (i_193_ == 0)
			break;
		if (i_193_ == 1) {
			class30_sub2_sub2.method408();
			break;
		}
		if (i_193_ <= 49)
			class30_sub2_sub2.method408();
		}
	}
	}
	
	public int method182(int i, int i_194_, int i_195_, int i_196_) {
	if (i_196_ != 0)
		return 2;
	if ((aByteArrayArrayArray149[i_194_][i_195_][i] & 0x8) != 0)
		return 0;
	if (i_194_ > 0 && (aByteArrayArrayArray149[1][i_195_][i] & 0x2) != 0)
		return i_194_ - 1;
	return i_194_;
	}
	
	public final void method183(Class11[] class11s, Class25 class25, int i,
				int i_197_, int i_198_, boolean bool,
				int i_199_, byte[] is, int i_200_, int i_201_,
				int i_202_) {
	Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(is, 891);
	int i_203_ = -1;
	if (!bool)
		aBoolean143 = !aBoolean143;
	for (;;) {
		int i_204_ = class30_sub2_sub2.method422();
		if (i_204_ == 0)
		break;
		i_203_ += i_204_;
		int i_205_ = 0;
		for (;;) {
		int i_206_ = class30_sub2_sub2.method422();
		if (i_206_ == 0)
			break;
		i_205_ += i_206_ - 1;
		int i_207_ = i_205_ & 0x3f;
		int i_208_ = i_205_ >> 6 & 0x3f;
		int i_209_ = i_205_ >> 12;
		int i_210_ = class30_sub2_sub2.method408();
		int i_211_ = i_210_ >> 2;
		int i_212_ = i_210_ & 0x3;
		if (i_209_ == i && i_208_ >= i_200_ && i_208_ < i_200_ + 8
			&& i_207_ >= i_198_ && i_207_ < i_198_ + 8) {
			Class46 class46 = Class46.method572(i_203_);
			int i_213_
			= (i_197_
			   + Class4.method157(i_201_, class46.anInt761,
						  i_208_ & 0x7, (byte) 113,
						  i_207_ & 0x7, class46.anInt744));
			int i_214_
			= (i_202_
			   + Class4.method158(-433, i_207_ & 0x7,
						  class46.anInt761, i_201_,
						  class46.anInt744, i_208_ & 0x7));
			if (i_213_ > 0 && i_214_ > 0 && i_213_ < 103
			&& i_214_ < 103) {
			int i_215_ = i_209_;
			if ((aByteArrayArrayArray149[1][i_213_][i_214_] & 0x2)
				== 2)
				i_215_--;
			Class11 class11 = null;
			if (i_215_ >= 0)
				class11 = class11s[i_215_];
			method175(i_214_, class25, class11, i_211_, i_199_,
				  i_213_, i_203_, false,
				  i_212_ + i_201_ & 0x3);
			}
		}
		}
	}
	}
	
	private static final int method184(int i, int i_216_, int i_217_,
					   int i_218_) {
	int i_219_ = (65536 - (Class30_Sub2_Sub1_Sub3.anIntArray1471
				   [i_217_ * 1024 / i_218_])
			  >> 1);
	return (i * (65536 - i_219_) >> 16) + (i_216_ * i_219_ >> 16);
	}
	
	private final int method185(int i, int i_220_) {
	if (i == -2)
		return 12345678;
	if (i == -1) {
		if (i_220_ < 0)
		i_220_ = 0;
		else if (i_220_ > 127)
		i_220_ = 127;
		i_220_ = 127 - i_220_;
		return i_220_;
	}
	i_220_ = i_220_ * (i & 0x7f) / 128;
	if (i_220_ < 2)
		i_220_ = 2;
	else if (i_220_ > 126)
		i_220_ = 126;
	return (i & 0xff80) + i_220_;
	}
	
	private static final int method186(int i, int i_221_) {
	int i_222_
		= (method170(i - 1, i_221_ - 1) + method170(i + 1, i_221_ - 1)
		   + method170(i - 1, i_221_ + 1) + method170(i + 1, i_221_ + 1));
	int i_223_ = (method170(i - 1, i_221_) + method170(i + 1, i_221_)
			  + method170(i, i_221_ - 1) + method170(i, i_221_ + 1));
	int i_224_ = method170(i, i_221_);
	return i_222_ / 16 + i_223_ / 8 + i_224_ / 4;
	}
	
	private static final int method187(int i, int i_225_) {
	if (i == -1)
		return 12345678;
	i_225_ = i_225_ * (i & 0x7f) / 128;
	if (i_225_ < 2)
		i_225_ = 2;
	else if (i_225_ > 126)
		i_225_ = 126;
	return (i & 0xff80) + i_225_;
	}
	
	public static final void method188(Class25 class25, int i, int i_226_,
					   int i_227_, int i_228_, Class11 class11,
					   int[][][] is, int i_229_, int i_230_,
					   int i_231_, byte i_232_) {
	int i_233_ = is[i_228_][i_229_][i_226_];
	int i_234_ = is[i_228_][i_229_ + 1][i_226_];
	int i_235_ = is[i_228_][i_229_ + 1][i_226_ + 1];
	int i_236_ = is[i_228_][i_229_][i_226_ + 1];
	if (i_232_ != 93){
//		anInt153 = -145;	//REMOVED due to it not being used anywhere except being set 4/20/17
	}
	int i_237_ = i_233_ + i_234_ + i_235_ + i_236_ >> 2;
	Class46 class46 = Class46.method572(i_230_);
	int i_238_ = i_229_ + (i_226_ << 7) + (i_230_ << 14) + 1073741824;
	if (!class46.aBoolean778)
		i_238_ += -2147483648;
	byte i_239_ = (byte) ((i << 6) + i_227_);
	if (i_227_ == 22) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4 = class46.method578(22, i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, 22, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method280(i_231_, i_237_, i_226_, 68, class30_sub2_sub4,
				  i_239_, i_238_, i_229_);
		if (class46.aBoolean767 && class46.aBoolean778)
		class11.method213(i_226_, 0, i_229_);
	} else if (i_227_ == 10 || i_227_ == 11) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4 = class46.method578(10, i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, 10, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		if (class30_sub2_sub4 != null) {
		int i_240_ = 0;
		if (i_227_ == 11)
			i_240_ += 256;
		int i_241_;
		int i_242_;
		if (i == 1 || i == 3) {
			i_241_ = class46.anInt761;
			i_242_ = class46.anInt744;
		} else {
			i_241_ = class46.anInt744;
			i_242_ = class46.anInt761;
		}
		class25.method284(i_238_, i_239_, i_237_, i_242_,
				  class30_sub2_sub4, i_241_, i_231_, i_240_,
				  (byte) 110, i_226_, i_229_);
		}
		if (class46.aBoolean767)
		class11.method212(class46.aBoolean757, anInt138,
				  class46.anInt744, class46.anInt761, i_229_,
				  i_226_, i);
	} else if (i_227_ >= 12) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4
			= class46.method578(i_227_, i, i_233_, i_234_, i_235_,
					i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, i_227_, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method284(i_238_, i_239_, i_237_, 1, class30_sub2_sub4, 1,
				  i_231_, 0, (byte) 110, i_226_, i_229_);
		if (class46.aBoolean767)
		class11.method212(class46.aBoolean757, anInt138,
				  class46.anInt744, class46.anInt761, i_229_,
				  i_226_, i);
	} else if (i_227_ == 0) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4 = class46.method578(0, i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, 0, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method282(anIntArray152[i], class30_sub2_sub4, true,
				  i_238_, i_226_, i_239_, i_229_, null, i_237_, 0,
				  i_231_);
		if (class46.aBoolean767)
		class11.method211(i_226_, i, i_229_, i_227_, (byte) 1,
				  class46.aBoolean757);
	} else if (i_227_ == 1) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4 = class46.method578(1, i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, 1, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method282(anIntArray140[i], class30_sub2_sub4, true,
				  i_238_, i_226_, i_239_, i_229_, null, i_237_, 0,
				  i_231_);
		if (class46.aBoolean767)
		class11.method211(i_226_, i, i_229_, i_227_, (byte) 1,
				  class46.aBoolean757);
	} else if (i_227_ == 2) {
		int i_243_ = i + 1 & 0x3;
		Class30_Sub2_Sub4 class30_sub2_sub4;
		Class30_Sub2_Sub4 class30_sub2_sub4_244_;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null) {
		class30_sub2_sub4 = class46.method578(2, 4 + i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		class30_sub2_sub4_244_
			= class46.method578(2, i_243_, i_233_, i_234_, i_235_,
					i_236_, -1);
		} else {
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 4 + i, 2, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class30_sub2_sub4_244_
			= new Class30_Sub2_Sub4_Sub5(i_230_, i_243_, 2, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		}
		class25.method282(anIntArray152[i], class30_sub2_sub4, true,
				  i_238_, i_226_, i_239_, i_229_,
				  class30_sub2_sub4_244_, i_237_,
				  anIntArray152[i_243_], i_231_);
		if (class46.aBoolean767)
		class11.method211(i_226_, i, i_229_, i_227_, (byte) 1,
				  class46.aBoolean757);
	} else if (i_227_ == 3) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4 = class46.method578(3, i, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, 3, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method282(anIntArray140[i], class30_sub2_sub4, true,
				  i_238_, i_226_, i_239_, i_229_, null, i_237_, 0,
				  i_231_);
		if (class46.aBoolean767)
		class11.method211(i_226_, i, i_229_, i_227_, (byte) 1,
				  class46.aBoolean757);
	} else if (i_227_ == 9) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
		class30_sub2_sub4
			= class46.method578(i_227_, i, i_233_, i_234_, i_235_,
					i_236_, -1);
		else
		class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, i, i_227_, i_234_,
						 (byte) 7, i_235_, i_233_,
						 i_236_, class46.anInt781,
						 true);
		class25.method284(i_238_, i_239_, i_237_, 1, class30_sub2_sub4, 1,
				  i_231_, 0, (byte) 110, i_226_, i_229_);
		if (class46.aBoolean767)
		class11.method212(class46.aBoolean757, anInt138,
				  class46.anInt744, class46.anInt761, i_229_,
				  i_226_, i);
	} else {
		if (class46.aBoolean762) {
		if (i == 1) {
			int i_245_ = i_236_;
			i_236_ = i_235_;
			i_235_ = i_234_;
			i_234_ = i_233_;
			i_233_ = i_245_;
		} else if (i == 2) {
			int i_246_ = i_236_;
			i_236_ = i_234_;
			i_234_ = i_246_;
			i_246_ = i_235_;
			i_235_ = i_233_;
			i_233_ = i_246_;
		} else if (i == 3) {
			int i_247_ = i_236_;
			i_236_ = i_233_;
			i_233_ = i_234_;
			i_234_ = i_235_;
			i_235_ = i_247_;
		}
		}
		if (i_227_ == 4) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
			class30_sub2_sub4 = class46.method578(4, 0, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
			class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 0, 4, i_234_,
							 (byte) 7, i_235_, i_233_,
							 i_236_, class46.anInt781,
							 true);
		class25.method283(i_238_, i_226_, i * 512, -460, i_231_, 0,
				  i_237_, class30_sub2_sub4, i_229_, i_239_, 0,
				  anIntArray152[i]);
		} else if (i_227_ == 5) {
		int i_248_ = 16;
		int i_249_ = class25.method300(i_231_, i_229_, i_226_);
		if (i_249_ > 0)
			i_248_ = Class46.method572(i_249_ >> 14 & 0x7fff).anInt775;
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
			class30_sub2_sub4 = class46.method578(4, 0, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
			class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 0, 4, i_234_,
							 (byte) 7, i_235_, i_233_,
							 i_236_, class46.anInt781,
							 true);
		class25.method283(i_238_, i_226_, i * 512, -460, i_231_,
				  anIntArray137[i] * i_248_, i_237_,
				  class30_sub2_sub4, i_229_, i_239_,
				  anIntArray144[i] * i_248_, anIntArray152[i]);
		} else if (i_227_ == 6) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
			class30_sub2_sub4 = class46.method578(4, 0, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
			class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 0, 4, i_234_,
							 (byte) 7, i_235_, i_233_,
							 i_236_, class46.anInt781,
							 true);
		class25.method283(i_238_, i_226_, i, -460, i_231_, 0, i_237_,
				  class30_sub2_sub4, i_229_, i_239_, 0, 256);
		} else if (i_227_ == 7) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
			class30_sub2_sub4 = class46.method578(4, 0, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
			class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 0, 4, i_234_,
							 (byte) 7, i_235_, i_233_,
							 i_236_, class46.anInt781,
							 true);
		class25.method283(i_238_, i_226_, i, -460, i_231_, 0, i_237_,
				  class30_sub2_sub4, i_229_, i_239_, 0, 512);
		} else if (i_227_ == 8) {
		Class30_Sub2_Sub4 class30_sub2_sub4;
		if (class46.anInt781 == -1 && class46.anIntArray759 == null)
			class30_sub2_sub4 = class46.method578(4, 0, i_233_, i_234_,
							  i_235_, i_236_, -1);
		else
			class30_sub2_sub4
			= new Class30_Sub2_Sub4_Sub5(i_230_, 0, 4, i_234_,
							 (byte) 7, i_235_, i_233_,
							 i_236_, class46.anInt781,
							 true);
		class25.method283(i_238_, i_226_, i, -460, i_231_, 0, i_237_,
				  class30_sub2_sub4, i_229_, i_239_, 0, 768);
		}
	}
	}
	
	public static final boolean method189(int i, byte[] is, int i_250_,
					  int i_251_) {
	if (i_251_ < 6 || i_251_ > 6)
		throw new NullPointerException();
	boolean bool = true;
	Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(is, 891);
	int i_252_ = -1;
	for (;;) {
		int i_253_ = class30_sub2_sub2.method422();
		if (i_253_ == 0)
		break;
		i_252_ += i_253_;
		int i_254_ = 0;
		boolean bool_255_ = false;
		for (;;) {
		if (bool_255_) {
			int i_256_ = class30_sub2_sub2.method422();
			if (i_256_ == 0)
			break;
			class30_sub2_sub2.method408();
		} else {
			int i_257_ = class30_sub2_sub2.method422();
			if (i_257_ == 0)
			break;
			i_254_ += i_257_ - 1;
			int i_258_ = i_254_ & 0x3f;
			int i_259_ = i_254_ >> 6 & 0x3f;
			int i_260_ = class30_sub2_sub2.method408() >> 2;
			int i_261_ = i_259_ + i;
			int i_262_ = i_258_ + i_250_;
			if (i_261_ > 0 && i_262_ > 0 && i_261_ < 103
			&& i_262_ < 103) {
			Class46 class46 = Class46.method572(i_252_);
			if (i_260_ != 22 || !aBoolean151 || class46.aBoolean778
				|| class46.aBoolean736) {
				bool &= class46.method579(true);
				bool_255_ = true;
			}
			}
		}
		}
	}
	return bool;
	}
	
	public final void method190(int i, Class11[] class11s, int i_263_,
				int i_264_, Class25 class25, byte[] is) {
	if (i_264_ >= 7 && i_264_ <= 7) {
		Class30_Sub2_Sub2 class30_sub2_sub2
		= new Class30_Sub2_Sub2(is, 891);
		int i_265_ = -1;
		for (;;) {
		int i_266_ = class30_sub2_sub2.method422();
		if (i_266_ == 0)
			break;
		i_265_ += i_266_;
		int i_267_ = 0;
		for (;;) {
			int i_268_ = class30_sub2_sub2.method422();
			if (i_268_ == 0)
			break;
			i_267_ += i_268_ - 1;
			int i_269_ = i_267_ & 0x3f;
			int i_270_ = i_267_ >> 6 & 0x3f;
			int i_271_ = i_267_ >> 12;
			int i_272_ = class30_sub2_sub2.method408();
			int i_273_ = i_272_ >> 2;
			int i_274_ = i_272_ & 0x3;
			int i_275_ = i_270_ + i;
			int i_276_ = i_269_ + i_263_;
			if (i_275_ > 0 && i_276_ > 0 && i_275_ < 103
			&& i_276_ < 103) {
			int i_277_ = i_271_;
			if ((aByteArrayArrayArray149[1][i_275_][i_276_] & 0x2)
				== 2)
				i_277_--;
			Class11 class11 = null;
			if (i_277_ >= 0)
				class11 = class11s[i_277_];
			method175(i_276_, class25, class11, i_273_, i_271_,
				  i_275_, i_265_, false, i_274_);
			}
		}
		}
	}
	}
}