// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public class Class20
{

	public static void method257(int i, Class44 class44)
	{
		for(int j = 0; j < FrameStart.length; j++)
		FrameStart[j] = 0;
		Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("seq.dat", null), 891);
		anInt350 = class30_sub2_sub2.method410()+3299;
		if(aClass20Array351 == null)
		aClass20Array351 = new Class20[anInt350];
		for(int j = 0; j < anInt350; j++)
		{
			if(aClass20Array351[j] == null)
			aClass20Array351[j] = new Class20();
			if(j < 3997)
			aClass20Array351[j].method259(true, class30_sub2_sub2);
			else
			setAnimBase(j);
			Class20_Sub1.handleAnims(j);
			Class20_Sub2.handleAnims1(j);


if (j == 808) { // 525 Stand Emote
			int file = 999;
			if (FrameStart[file] < 1)
			Class36.methodCustomAnimations(false, file);
			int[] frames = { 12, 6, 29, 46, 15, 16, 41, 51, 44, 53, 22, 52, 38,
					23, 35, 48, 0 };
			aClass20Array351[j].anInt352 = (frames.length - 1);
			aClass20Array351[j].anIntArray353 = new int[frames.length - 1];
			aClass20Array351[j].anIntArray354 = new int[frames.length - 1];
			aClass20Array351[j].anIntArray355 = new int[frames.length - 1];
			for (int i2 = 0; i2 < frames.length - 1; i2++) {
				aClass20Array351[j].anIntArray353[i2] = frames[i2] + FrameStart[file];
				aClass20Array351[j].anIntArray354[i2] = -1;
				aClass20Array351[j].anIntArray355[i2] = 3;
			}
}
if(j == 6968){ 	//Saradomin sword GFX
int file = 1755;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {4,18,26,27,16,28,23,29,0,24,21,25,2,3,12,7,9,17,20,5,11,6,15,10,22,19,8,14,13,1,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 7076){ // Saradomin Sword white bolt
int file = 1749;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames ={36,11,37,30,15,20,40,23,48,44,5,10,21,18,9,49,34,42,3,25,22,33,29,28,2,0};
int[] delays = {14,3,2,2,2,2,2,2,2,2, 2,2,2,2,2,20,2,2,2,2,2,2,2,2,6,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
/*Other Emotes*/
if(j == 1658){
int file = 300;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {190,214,215,216,217,218,219,220,221,208,209,210,211,212,213,0};
int[] delays = {4,3,2,1,1,4,2,2,8,1,2,2,3,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 321) { //2h attack
int file = 1747;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {97,98,99,100,101,102,103,104,105,106,107,108,109, 110,111,112,113,114,115};
int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4230){
int file = 1088;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {64,74,75,76,77,78,79,80,81,65,66,67,68,69,70,71,72,73,249,0};
int[] delays = {10,5,4,4,3,3,5,11,3,4,5,6,3,3,3,3,3,2,1,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
	if(j == 306) { //2h run
			int file = 1834;
		if(FrameStart[file] < 1)
			Class36.methodCustomAnimations(false, file);
				int[] frames = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,
								88,89,90,91,92,93,94,95,96};
			aClass20Array351[j].anInt352 = frames.length-1;
			aClass20Array351[j].anIntArray353 = new int[frames.length-1];
			aClass20Array351[j].anIntArray354 = new int[frames.length-1];
			aClass20Array351[j].anIntArray355 = new int[frames.length-1];
		for(int i2 = 0; i2 < frames.length-1; i2++) {
			aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
			aClass20Array351[j].anIntArray354[i2] = -1;
			aClass20Array351[j].anIntArray355[i2] = 1*20-21;
		}
	}


if(j == 1083){ // Cbow walk
int file = 1088;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {8,9,10,11,12,13,14,15,0};
int[] delays = {6,6,6,6,6,6,6,6,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 6000){
int file = 1836;
Class20 a = aClass20Array351[j];
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames  = {75,75,62,62,93,93,93,82,82,57,57,71,71,66,66,66,61,92,73,73,65,65,89,89,70,70,81,81,67,67,67,84,59,63,63,99,99,78,69,69,96,96,74,74,74,79,90,90,94,94,58,0};
a.anInt352 = frames.length-1;
a.anIntArray353 = new int[frames.length-1];
a.anIntArray354 = new int[frames.length-1];
a.anIntArray355 = new int[frames.length-1];
a.anInt363 = 0;
a.anInt364 = 0;
for(int i2 = 0; i2 < frames.length-1; i2++){
a.anIntArray353[i2] = frames[i2]+FrameStart[file];
a.anIntArray354[i2] = -1;
a.anIntArray355[i2] = 2;
}
}
if(j == 2075){ 
int file = 1835;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {78,97,98,99,100,101,102,184,185,178,179,180,181,182,183,102,101,100,99,98,97,78,0};
int[] delays = {3,3,3,3,3,3,3,6,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 355){
int file = 1063;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {97,98,99,100,101,102,0};
int[] delays = {7,7,7,7,7,7,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Vengeance Emote
if(j == 4410){
int file = 1076;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {446,457,468,473,474,475,476,477,478,447,448,449,450,451,452,453,454,455,456,458,459,460,461,462,463,464,465,466,467,469,470,471,472,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Veng Other Emote
if(j == 4411){
int file = 1076;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {400,411,422,433,441,442,443,444,445,401,402,403,404,405,406,407,408,409,410,412,413,414,415,416,417,418,419,420,421,423,424,425,426,427,428,429,430,431,432,434,435,436,437,438,439,440,0};
int[] delays = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,4,4,4,4,4,4,4,4,4,4,4,4,2,2,2,2,2,2,2,2,2,2,2,6,5,5,5,5,5,5,5,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
//Veng & Veng Other GFX
if(j == 4417){
int file = 1161;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {1,11,17,18,19,20,21,22,23,0,2,3,4,5,6,7,8,9,10,12,13,14,15,0};
int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,6,6,6,5,5,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 301) { //2h Stand
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 7077){		//Bandos		
int file = 1768;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {2,26,13,40,27,27,27,21,21,21,48,39,44,6,53,28,1,18,17,38,22,36,23,57,50,25,16,11,12,33,7,30,42,9,46,4,19,0};
int[] delays = {12,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,8,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 7075){	//Armadyl
int file = 1771;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {5,5,5,5,5,5,5,5,5,5,5,17,3,13,18,6,15,16,12,8,4,9,2,14,11,1,0,10,7,7,7,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
/*Dragon Emotes*/
if(j == 6722){//attack
int file = 1210;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {265,276,287,298,309,320,322,323,324,266,267,268,269,270,271,272,273,274,275,277,278,279,280,281,282,283,284,285,286,288,289,290,291,292,293,294,295,296,297,299,300,301,302,303,304,305,306,307,308,310,311,312,313,314,315,316,317,318,319,321,0};
int[] delays = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4642){///death
int file = 1210;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {53,53,64,64,75,75,83,84,85,86,87,88,54,55,56,57,58,58,59,60,61,62,63,65,66,67,67,0};
int[] delays = {3,3,4,4,5,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,10,100,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4638){//block
int file = 1210;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {144,147,148,149,150,151,152,153,154,145,146,145,154,153,152,151,150,149,148,147,144,0};
int[] delays = {2,2,2,2,2,2,2,2,2,2,25,2,2,2,2,2,2,2,2,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 4635){//walk
int file = 1210;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {249,257,258,259,260,261,262,263,264,250,251,252,253,254,255,256,0};
int[] delays = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
if(j == 90){//stand
int file = 1210;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {195,196,197,198,199,200,201,200,199,198,197,196,0};
int[] delays = {7,7,7,7,7,7,7,7,7,7,7,7,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}
/*GodSword Emotes*/
if(j == 7068){
int file = 1766;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {0,33,8,4,15,2,23,28,22,25,24,30,32,6,11,17,7,20,21,27,3,13,9,18,34,29,19,16,5,26,31,14,12,1,0};
int[] delays = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

if(j == 7069){
int file = 1770;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {44,44,44,44,44,44,44,44,34,35,28,29,23,38,25,30,11,8,22,26,43,2,32,5,42,27,4,13,0,24,3,1,37,12,17,18,33,7,39,39,0};
int[] delays = {2,2,2,2,2,3,3,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++){
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = delays[i2];
}
}

if(j == 302) { //BGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 303) { //ZGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 304) { //SGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 305) { //AGS special emote
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
/*GodSword Emotes*/
if(j == 307) { //2h walk
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}
if(j == 309) { //2h block
int file = 1834;
if(FrameStart[file] < 1)
Class36.methodCustomAnimations(false, file);
int[] frames = {116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135};
aClass20Array351[j].anInt352 = frames.length-1;
aClass20Array351[j].anIntArray353 = new int[frames.length-1];
aClass20Array351[j].anIntArray354 = new int[frames.length-1];
aClass20Array351[j].anIntArray355 = new int[frames.length-1];
for(int i2 = 0; i2 < frames.length-1; i2++) {
aClass20Array351[j].anIntArray353[i2] = frames[i2]+FrameStart[file];
aClass20Array351[j].anIntArray354[i2] = -1;
aClass20Array351[j].anIntArray355[i2] = 0;
}
}	  			


/* End of Wolves */



			

		}

		if(i != 0)
		{
			for(int k = 1; k > 0; k++);
		}
	}

	public static void setAnimBase(int j){
		aClass20Array351[j].anInt352 = aClass20Array351[808].anInt352;
		aClass20Array351[j].anIntArray353 = aClass20Array351[808].anIntArray353;
		aClass20Array351[j].anIntArray354 = aClass20Array351[808].anIntArray354;
		aClass20Array351[j].anIntArray355 = aClass20Array351[808].anIntArray355;
		aClass20Array351[j].anInt356 = aClass20Array351[808].anInt356;
		aClass20Array351[j].anIntArray357 = aClass20Array351[808].anIntArray357;
		aClass20Array351[j].anInt359 = aClass20Array351[808].anInt359;
		aClass20Array351[j].anInt360 = aClass20Array351[808].anInt360;
		aClass20Array351[j].anInt361 = aClass20Array351[808].anInt361;
		aClass20Array351[j].anInt362 = aClass20Array351[808].anInt362;
		aClass20Array351[j].anInt363 = aClass20Array351[808].anInt363;
		aClass20Array351[j].anInt364 = aClass20Array351[808].anInt364;
		aClass20Array351[j].anInt365 = aClass20Array351[808].anInt365;
		aClass20Array351[j].anInt366 = aClass20Array351[808].anInt366;
		aClass20Array351[j].anInt352 = aClass20Array351[808].anInt352;
	}
	
	public int method258(int i, byte byte0)
	{
		int j = anIntArray355[i];
		if(byte0 != -39)
		{
			for(int k = 1; k > 0; k++);
		}
		if(j == 0)
		{
			Class36 class36 = Class36.method531(anInt348, anIntArray353[i]);
			if(class36 != null)
			j = anIntArray355[i] = class36.anInt636;
		}
		if(j == 0)
		j = 1;
		return j;
	}

	public void method259(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
	{
		if(!flag)
		aBoolean349 = !aBoolean349;
		do
		{
			int i = class30_sub2_sub2.method408();
			if(i == 0)
			break;
			if(i == 1)
			{
				anInt352 = class30_sub2_sub2.method408();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int j = 0; j < anInt352; j++)
				{
					anIntArray353[j] = class30_sub2_sub2.method410();
					anIntArray354[j] = class30_sub2_sub2.method410();
					if(anIntArray354[j] == 65535)
					anIntArray354[j] = -1;
					anIntArray355[j] = class30_sub2_sub2.method410();
				}

			} else
			if(i == 2)
			anInt356 = class30_sub2_sub2.method410();
			else
			if(i == 3)
			{
				int k = class30_sub2_sub2.method408();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
				anIntArray357[l] = class30_sub2_sub2.method408();

				anIntArray357[k] = 0x98967f;
			} else
			if(i == 4)
			aBoolean358 = true;
			else
			if(i == 5)
			anInt359 = class30_sub2_sub2.method408();
			else
			if(i == 6)
			anInt360 = class30_sub2_sub2.method410();
			else
			if(i == 7)
			anInt361 = class30_sub2_sub2.method410();
			else
			if(i == 8)
			anInt362 = class30_sub2_sub2.method408();
			else
			if(i == 9)
			anInt363 = class30_sub2_sub2.method408();
			else
			if(i == 10)
			anInt364 = class30_sub2_sub2.method408();
			else
			if(i == 11)
			anInt365 = class30_sub2_sub2.method408();
			else
			if(i == 12)
			anInt366 = class30_sub2_sub2.method413();
			else
			System.out.println("Error unrecognised seq config code: " + i);
		} while(true);
		if(anInt352 == 0)
		{
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
		if(anIntArray357 != null)
		anInt363 = 2;
		else
		anInt363 = 0;
		if(anInt364 == -1)
		{
			if(anIntArray357 != null)
			{
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}

	public Class20()
	{
		anInt348 = 9;
		aBoolean349 = false;
		anInt356 = -1;
		aBoolean358 = false;
		anInt359 = 5;
		anInt360 = -1;
		anInt361 = -1;
		anInt362 = 99;
		anInt363 = -1;
		anInt364 = -1;
		anInt365 = 2;
	}

	public static int FrameStart[] = new int[20000];
	private int anInt348;
	private boolean aBoolean349;
	public static int anInt350;
	public static Class20 aClass20Array351[];
	public int anInt352;
	public int anIntArray353[];
	public int anIntArray354[];
	public int anIntArray355[];
	public int anInt356;
	public int anIntArray357[];
	public boolean aBoolean358;
	public int anInt359;
	public int anInt360;
	public int anInt361;
	public int anInt362;
	public int anInt363;
	public int anInt364;
	public int anInt365;
	public int anInt366;
	public static int anInt367;
}
