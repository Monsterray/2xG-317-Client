import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

final class Class5
{

public static void dumpy(){

for(int i = 0; i < 3852; i++) {
Class5 class5 = method159(i);
BufferedWriter bw = null;      
try {
bw = new BufferedWriter(new FileWriter("npcList.txt", true));     
if(class5.aString65 != null) {            	  
bw.write("ID: "+i+"\t\t");	   
bw.newLine();
bw.write("ID: Name: "+class5.aString65);	 
bw.newLine();
bw.write("ID: combat: "+class5.anInt61);	 
bw.newLine();
for(int i2 = 0; i2 < class5.anIntArray94.length; i2++) {
if(i2 == 0) {
bw.write("ID: modelid: ");   
}
if(i2 != class5.anIntArray94.length - 1) {  
bw.write(""+class5.anIntArray94[i2]+", "); 
} else {          
bw.write(""+class5.anIntArray94[i2]);     
bw.newLine();
}       
}  


bw.newLine();
bw.flush();          
bw.close();	 
}
} catch (IOException ioe2) {      
}
}



}

    public static final Class5 method159(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aClass5Array80[j].aLong78 == (long)i)
                return aClass5Array80[j];

        anInt56 = (anInt56 + 1) % 20;
        Class5 class5 = aClass5Array80[anInt56] = new Class5();
        aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[i];
        class5.aLong78 = i;
        class5.method165(true, aClass30_Sub2_Sub2_60);
		if(i == 81){
	class5.aStringArray66 = new String[5];
	class5.aStringArray66[1] = "Attack";
	class5.aString65 = "Green Dragon @gre@(level-9999)";
	class5.aByteArray89 = "Wowzas!".getBytes();
	}
if(i == 72) { // NPC ID
    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    class5.method165(true, aClass30_Sub2_Sub2_60); // Collect original NPC data
    class5.aStringArray66 = new String[5];
    class5.aStringArray66[1] = "Attack";
         class5.anIntArray94 = new int[3]; // Number of models the NPC uses
         class5.anIntArray94[0] = 10013; // 
         class5.anIntArray94[1] = 10128; // 
         class5.anIntArray94[2] = 10186; // 
    class5.aString65 = "Mithril Dragon"; // NPC name
    class5.anInt61 = 304; //combat level
    class5.aByteArray89 = "A scary dragon made of mithril".getBytes(); // NPC description
}
if(i == 5) { 					
	aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630];
	class5.method165(true, aClass30_Sub2_Sub2_60);
	class5.aStringArray66 = new String[5];
	class5.aStringArray66[1] = "Attack";

	class5.aString65 = "Spirit Beast";
	class5.anInt61 = 900;
	class5.aByteArray89 = "A beast that eats souls...".getBytes();

	class5.anIntArray94 = new int[1];
	class5.anIntArray94[0] = 4095;
     }
if(i == 945) //chosen npc to change name of
{
//class5.anInt61 = 0; // Level
class5.aString65 = "2xG Classic Guide";
class5.aByteArray89 = "Your introduction to Project 317.".getBytes();
}
if(i == 3582)
        {
            aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630];
            class5.method165(true, aClass30_Sub2_Sub2_60);
            class5.aStringArray66 = new String[5];
            class5.aStringArray66[1] = "Attack";
            class5.aString65 = "Elite Knight";
            class5.anInt61 = 138;
            class5.aByteArray89 = "whatch out it the elite clan leader!".getBytes();
            class5.anIntArray94 = new int[1];
            class5.anIntArray94[0] = 1441;
        }
if(i == 1115) { // NPC ID
    aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630]; 
    class5.method165(true, aClass30_Sub2_Sub2_60); 
    class5.aStringArray66 = new String[5];
    class5.aStringArray66[1] = "Attack";
    class5.anIntArray94 = new int[2];
    int changedColors = 1;
    class5.aByte68 = 3;
    class5.anIntArray76 = new int[changedColors];
    class5.anIntArray70 = new int[changedColors];
    class5.anIntArray76[0] = 61;
    class5.anIntArray70[0] = 926;
    class5.anIntArray94[0] = 27785;
    class5.anIntArray94[1] = 27789;
    class5.aString65 = "General Graardor"; // NPC name
    class5.anInt61 = 624; //combat level
    class5.anInt77 = 7059;	//Stand anim
    class5.anInt67 = 7058;	//Walk anim
    class5.aByteArray89 = "The mighty lord Bandos!".getBytes(); // NPC description
    class5.anInt91 = 110;
    class5.anInt86 = 110;
    class5.aByte68 = 3;
}
	if(i == 3333)
{
aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630];
class5.method165(true, aClass30_Sub2_Sub2_60);
class5.aStringArray66 = new String[5];
class5.aStringArray66[1] = "Attack";
class5.anIntArray94 = new int[1];
class5.anIntArray94[0] = 40959;
class5.anInt91 = 110;
class5.anInt86 = 110;
class5.aByte68 = 4;
class5.aString65 = "Corporeal Beast";
class5.anInt61 = 785;
class5.aByteArray89 = "A vision of supernatural horror.".getBytes();
}
if(i == 0) {
class5.aString65 = "Spirit Shield dispenser";
class5.aByteArray89 = "Killed me for spirit shields".getBytes();
}
if(i == 1003) { 					
	aClass30_Sub2_Sub2_60.anInt1406 = anIntArray72[630];
	class5.method165(true, aClass30_Sub2_Sub2_60);
	class5.aStringArray66 = new String[5];
	class5.aStringArray66[1] = "Attack";

	class5.aString65 = "Tormented Demon";
	class5.anInt61 = 667;
	class5.aByteArray89 = "Very scary demon !".getBytes();

	class5.anIntArray94 = new int[1];
	class5.anIntArray94[0] = 11512;
     }
        return class5;
    }

    public final Class30_Sub2_Sub4_Sub6 method160(boolean flag)
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161(anInt64);
            if(class5 == null)
                return null;
            else
                return class5.method160(true);
        }
        if(anIntArray73 == null)
            return null;
        boolean flag1 = false;
        if(!flag)
            anInt64 = 303;
        for(int i = 0; i < anIntArray73.length; i++)
            if(!Class30_Sub2_Sub4_Sub6.method463(anIntArray73[i]))
                flag1 = true;

        if(flag1)
            return null;
        Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = new Class30_Sub2_Sub4_Sub6[anIntArray73.length];
        for(int j = 0; j < anIntArray73.length; j++)
            aclass30_sub2_sub4_sub6[j] = Class30_Sub2_Sub4_Sub6.method462(anInt69, anIntArray73[j]);

        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
        if(aclass30_sub2_sub4_sub6.length == 1)
            class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[0];
        else
            class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
        if(anIntArray76 != null)
        {
            for(int k = 0; k < anIntArray76.length; k++)
                class30_sub2_sub4_sub6.method476(anIntArray76[k], anIntArray70[k]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final Class5 method161(int i)
    {
        int j = -1;
        if(i != 1834)
            aBoolean81 = !aBoolean81;
        if(anInt57 != -1)
        {
            Class37 class37 = Class37.aClass37Array646[anInt57];
            int k = class37.anInt648;
            int l = class37.anInt649;
            int i1 = class37.anInt650;
            int j1 = client.anIntArray1232[i1 - l];
            j = aClient82.anIntArray971[k] >> l & j1;
        } else
        if(anInt59 != -1)
            j = aClient82.anIntArray971[anInt59];
        if(j < 0 || j >= anIntArray88.length || anIntArray88[j] == -1)
            return null;
        else
            return method159(anIntArray88[j]);
    }

    public static final void method162(Class44 class44)
    {
        aClass30_Sub2_Sub2_60 = new Class30_Sub2_Sub2(class44.method571("npc.dat", null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("npc.idx", null), 891);
        anInt62 = class30_sub2_sub2.method410();
        anIntArray72 = new int[anInt62];
        int i = 2;
        for(int j = 0; j < anInt62; j++)
        {
            anIntArray72[j] = i;
            i += class30_sub2_sub2.method410();
        }

        aClass5Array80 = new Class5[20];
        for(int k = 0; k < 20; k++)
            aClass5Array80[k] = new Class5();

    }

    public static final void method163(int i)
    {
        aClass12_95 = null;
        anIntArray72 = null;
        if(i >= 0){
//            anInt74 = 60;	//REMOVED due to it not being used anywhere except being set 4/20/17
        }
        aClass5Array80 = null;
        aClass30_Sub2_Sub2_60 = null;
    }

    public final Class30_Sub2_Sub4_Sub6 method164(int i, int j, int k, int ai[])
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161(anInt64);
            if(class5 == null)
                return null;
            else
                return class5.method164(0, j, k, ai);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_95.method222(aLong78);
        if(i != 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(class30_sub2_sub4_sub6 == null)
        {
            boolean flag = false;
            for(int i1 = 0; i1 < anIntArray94.length; i1++)
                if(!Class30_Sub2_Sub4_Sub6.method463(anIntArray94[i1]))
                    flag = true;

            if(flag)
                return null;
            Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = new Class30_Sub2_Sub4_Sub6[anIntArray94.length];
            for(int j1 = 0; j1 < anIntArray94.length; j1++)
                aclass30_sub2_sub4_sub6[j1] = Class30_Sub2_Sub4_Sub6.method462(anInt69, anIntArray94[j1]);

            if(aclass30_sub2_sub4_sub6.length == 1)
                class30_sub2_sub4_sub6 = aclass30_sub2_sub4_sub6[0];
            else
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
            if(anIntArray76 != null)
            {
                for(int k1 = 0; k1 < anIntArray76.length; k1++)
                    class30_sub2_sub4_sub6.method476(anIntArray76[k1], anIntArray70[k1]);

            }
            class30_sub2_sub4_sub6.method469((byte)-71);
            class30_sub2_sub4_sub6.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
            aClass12_95.method223(class30_sub2_sub4_sub6, aLong78, (byte)2);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.aClass30_Sub2_Sub4_Sub6_1621;
        class30_sub2_sub4_sub6_1.method464(7, class30_sub2_sub4_sub6, Class36.method532(k, false) & Class36.method532(j, false));
        if(k != -1 && j != -1)
            class30_sub2_sub4_sub6_1.method471(-20491, ai, j, k);
        else
        if(k != -1)
            class30_sub2_sub4_sub6_1.method470(k, 40542);
        if(anInt91 != 128 || anInt86 != 128)
            class30_sub2_sub4_sub6_1.method478(anInt91, anInt91, anInt63, anInt86);
        class30_sub2_sub4_sub6_1.method466(false);
        class30_sub2_sub4_sub6_1.anIntArrayArray1658 = null;
        class30_sub2_sub4_sub6_1.anIntArrayArray1657 = null;
        if(aByte68 == 1)
            class30_sub2_sub4_sub6_1.aBoolean1659 = true;
        return class30_sub2_sub4_sub6_1;
    }

    private final void method165(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
            {
                int j = class30_sub2_sub2.method408();
                anIntArray94 = new int[j];
                for(int j1 = 0; j1 < j; j1++)
                    anIntArray94[j1] = class30_sub2_sub2.method410();

            } else
            if(i == 2)
                aString65 = class30_sub2_sub2.method415();
            else
            if(i == 3)
                aByteArray89 = class30_sub2_sub2.method416((byte)30);
            else
            if(i == 12)
                aByte68 = class30_sub2_sub2.method409();
            else
            if(i == 13)
                anInt77 = class30_sub2_sub2.method410();
            else
            if(i == 14)
                anInt67 = class30_sub2_sub2.method410();
            else
            if(i == 17)
            {
                anInt67 = class30_sub2_sub2.method410();
                anInt58 = class30_sub2_sub2.method410();
                anInt83 = class30_sub2_sub2.method410();
                anInt55 = class30_sub2_sub2.method410();
            } else
            if(i >= 30 && i < 40)
            {
                if(aStringArray66 == null)
                    aStringArray66 = new String[5];
                aStringArray66[i - 30] = class30_sub2_sub2.method415();
                if(aStringArray66[i - 30].equalsIgnoreCase("hidden"))
                    aStringArray66[i - 30] = null;
            } else
            if(i == 40)
            {
                int k = class30_sub2_sub2.method408();
                anIntArray76 = new int[k];
                anIntArray70 = new int[k];
                for(int k1 = 0; k1 < k; k1++)
                {
                    anIntArray76[k1] = class30_sub2_sub2.method410();
                    anIntArray70[k1] = class30_sub2_sub2.method410();
                }

            } else
            if(i == 60)
            {
                int l = class30_sub2_sub2.method408();
                anIntArray73 = new int[l];
                for(int l1 = 0; l1 < l; l1++)
                    anIntArray73[l1] = class30_sub2_sub2.method410();

            } else
            if(i == 90)
                anInt96 = class30_sub2_sub2.method410();
            else
            if(i == 91)
                anInt71 = class30_sub2_sub2.method410();
            else
            if(i == 92)
                anInt90 = class30_sub2_sub2.method410();
            else
            if(i == 93)
                aBoolean87 = false;
            else
            if(i == 95)
                anInt61 = class30_sub2_sub2.method410();
            else
            if(i == 97)
                anInt91 = class30_sub2_sub2.method410();
            else
            if(i == 98)
                anInt86 = class30_sub2_sub2.method410();
            else
            if(i == 99)
                aBoolean93 = true;
            else
            if(i == 100)
                anInt85 = class30_sub2_sub2.method409();
            else
            if(i == 101)
                anInt92 = class30_sub2_sub2.method409() * 5;
            else
            if(i == 102)

                anInt75 = class30_sub2_sub2.method410();


            else
            if(i == 103)
                anInt79 = class30_sub2_sub2.method410();
            else
            if(i == 106)
            {
                anInt57 = class30_sub2_sub2.method410();
                if(anInt57 == 65535)
                    anInt57 = -1;
                anInt59 = class30_sub2_sub2.method410();
                if(anInt59 == 65535)
                    anInt59 = -1;
                int i1 = class30_sub2_sub2.method408();
                anIntArray88 = new int[i1 + 1];
                for(int i2 = 0; i2 <= i1; i2++)
                {
                    anIntArray88[i2] = class30_sub2_sub2.method410();
                    if(anIntArray88[i2] == 65535)
                        anIntArray88[i2] = -1;
                }

            } else
            if(i == 107)
                aBoolean84 = false;
        } while(true);
    }

    Class5()
    {
        anInt55 = -1;
        anInt57 = -1;
        anInt58 = -1;
        anInt59 = -1;
        anInt61 = -1;
        anInt63 = 9;
        anInt64 = 1834;
        anInt67 = -1;
        aByte68 = 1;
        anInt69 = 9;
        anInt71 = -1;
        anInt75 = -1;
        anInt77 = -1;
        aLong78 = -1L;
        anInt79 = 32;
        aBoolean81 = false;
        anInt83 = -1;
        aBoolean84 = true;
        anInt86 = 128;
        aBoolean87 = true;
        anInt90 = -1;
        anInt91 = 128;
        aBoolean93 = false;
        anInt96 = -1;
    }

    public int anInt55;
    private static int anInt56;
    public int anInt57;
    public int anInt58;
    public int anInt59;
    private static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_60;
    public int anInt61;
    public static int anInt62;
    private int anInt63;
    private int anInt64;
    public String aString65;
    public String aStringArray66[];
    public int anInt67;
    public byte aByte68;
    private int anInt69;
    private int anIntArray70[];
    public int anInt71;
    private static int anIntArray72[];
    private int anIntArray73[];
//    private static int anInt74 = 748;	//REMOVED Said its not used 4/20/17
    public int anInt75;
    private int anIntArray76[];
    public int anInt77;
    public long aLong78;
    public int anInt79;
    private static Class5 aClass5Array80[];
    private boolean aBoolean81;
    public static client aClient82;
    public int anInt83;
    public boolean aBoolean84;
    private int anInt85;
    private int anInt86;
    public boolean aBoolean87;
    public int anIntArray88[];
    public byte aByteArray89[];
    public int anInt90;
    private int anInt91;
    private int anInt92;
    public boolean aBoolean93;
    private int anIntArray94[];
    public static Class12 aClass12_95 = new Class12(false, 30);
    public int anInt96;

}
