// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public class Class23
{
public static void setGFXBase(int j){
                aClass23Array403[j].anInt405 = aClass23Array403[369].anInt405;
                 aClass23Array403[j].aClass20_407 = aClass23Array403[369].aClass20_407;
                aClass23Array403[j].anInt406 = aClass23Array403[369].anInt406;
                aClass23Array403[j].anInt410 = aClass23Array403[369].anInt410;
                aClass23Array403[j].anInt411 = aClass23Array403[369].anInt411;
                aClass23Array403[j].anInt412 = aClass23Array403[369].anInt412;
                aClass23Array403[j].anInt413 = aClass23Array403[369].anInt413;
                aClass23Array403[j].anInt414 = aClass23Array403[369].anInt414;
                aClass23Array403[j].anIntArray408 = aClass23Array403[369].anIntArray408;
                aClass23Array403[j].anIntArray409 = aClass23Array403[369].anIntArray409;
}
    public static void method264(int i, Class44 class44)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("spotanim.dat", null), 891);
        if(i != 0)
            aBoolean401 = !aBoolean401;
        anInt402 = class30_sub2_sub2.method410()+600;
        if(aClass23Array403 == null)
            aClass23Array403 = new Class23[anInt402];
        for(int j = 0; j < anInt402; j++)
        {
            if(aClass23Array403[j] == null)
                aClass23Array403[j] = new Class23();
            aClass23Array403[j].anInt404 = j;
            if(j < 666)
            aClass23Array403[j].method265(true, class30_sub2_sub2);
            else 
            setGFXBase(j);
if(j == 643){ // Veng Other
	aClass23Array403[j].anInt405 = 1828;// Model
	aClass23Array403[j].anInt406 = 4417; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}

if(j == 657){ // Vengeance
	aClass23Array403[j].anInt405 = 12411;// Model 
	aClass23Array403[j].anInt406 = 4417; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}	
if(j == 600){ // Bandos
	aClass23Array403[j].anInt405 = 10555;// Model
	aClass23Array403[j].anInt406 = 7077; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}
if(j == 601){ // Armadyl
	aClass23Array403[j].anInt405 = 2849;
	aClass23Array403[j].anInt406 = 7075;
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];
}
if(j == 602){ // Saradomin
        aClass23Array403[j].anInt405 = 28195;
        aClass23Array403[j].anInt406 = 7068;
        aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];
}
if(j == 604){ // zamorak
	aClass23Array403[j].anInt405 = 8223;
	aClass23Array403[j].anInt406 = 7069;
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];
}
if(j == 656){ // Saradomin sword
	aClass23Array403[j].anInt405 = 2500;
	aClass23Array403[j].anInt406 = 6968;
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];
}
if(j == 658) //ss white bolt
            {
                aClass23Array403[j].anInt405 = 10050;
                aClass23Array403[j].anInt406 = 7076;
                aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];
            }
			
if(j == 643){ // Darkbow spec
				aClass23Array403[j].anInt405 = 9687;
				aClass23Array403[j].anInt406 = 6585;
				aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];

			}
if(j == 614){ //str
	aClass23Array403[j].anInt405 = 18963;// Model
	aClass23Array403[j].anInt406 = 4982; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}                 
if(j == 613){ //wc
	aClass23Array403[j].anInt405 = 19092;// Model
	aClass23Array403[j].anInt406 = 4958; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}
if(j == 599){ //magic
	aClass23Array403[j].anInt405 = 19083;// Model
	aClass23Array403[j].anInt406 = 4940; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  
if(j == 710){ //Hp
	aClass23Array403[j].anInt405 = 18961;// Model
	aClass23Array403[j].anInt406 = 4972; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}	
if(j == 612){ //Hp
	aClass23Array403[j].anInt405 = 19081;// Model
	aClass23Array403[j].anInt406 = 4972; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}		
if(j == 611){ //attack
	aClass23Array403[j].anInt405 = 19071;// Model
	aClass23Array403[j].anInt406 = 4960; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}
if(j == 610){ // Mining k
	aClass23Array403[j].anInt405 = 19084;// Model
	aClass23Array403[j].anInt406 = 4942; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}		
if(j == 609){ // Smithing
	aClass23Array403[j].anInt405 = 19089;// Model
	aClass23Array403[j].anInt406 = 4944; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}		
if(j == 608){ // quest cape
	aClass23Array403[j].anInt405 = 19086;// Model
	aClass23Array403[j].anInt406 = 4946; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}

if(j == 607){ // runecrafting
	aClass23Array403[j].anInt405 = 19069;// Model
	aClass23Array403[j].anInt406 = 4948; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}
if(j == 606){ // Prayer
	aClass23Array403[j].anInt405 = 19085;// Model
	aClass23Array403[j].anInt406 = 4980; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}			
if(j == 605){ // Construction
	aClass23Array403[j].anInt405 = 19072;// Model
	aClass23Array403[j].anInt406 = 4954; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}
if(j == 628){ //Female hp
	aClass23Array403[j].anInt405 = 19082;// Model
	aClass23Array403[j].anInt406 = 4972; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
} 		
if(j == 627){ //Hunter
	aClass23Array403[j].anInt405 = 19978;// Model
	aClass23Array403[j].anInt406 = 5159; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
} 			
if(j == 626){ //Herblore
	aClass23Array403[j].anInt405 = 19080;// Model
	aClass23Array403[j].anInt406 = 4970; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
} 
if(j == 625){ //Agility
	aClass23Array403[j].anInt405 = 19070;// Model
	aClass23Array403[j].anInt406 = 4978; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
} 
if(j == 624){ //Slayer
	aClass23Array403[j].anInt405 = 19088;// Model
	aClass23Array403[j].anInt406 = 4968; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
} 
if(j == 623){ //Thieving
	aClass23Array403[j].anInt405 = 19091;// Model
	aClass23Array403[j].anInt406 = 4966; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  	
if(j == 622){ //Farming
	aClass23Array403[j].anInt405 = 19076;// Model
	aClass23Array403[j].anInt406 = 4964; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  				
if(j == 621){ //Defence
	aClass23Array403[j].anInt405 = 19075;// Model
	aClass23Array403[j].anInt406 = 4962; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  			
if(j == 620){ //Crafting
	aClass23Array403[j].anInt405 = 19074;// Model
	aClass23Array403[j].anInt406 = 4950; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  		
if(j == 619){ //Flething
	aClass23Array403[j].anInt405 = 19079;// Model
	aClass23Array403[j].anInt406 = 4938; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  
if(j == 618){ //cook
	aClass23Array403[j].anInt405 = 19073;// Model
	aClass23Array403[j].anInt406 = 4956; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}  
if(j == 617){ //range
	aClass23Array403[j].anInt405 = 19087;// Model
	aClass23Array403[j].anInt406 = 4974; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}   
if(j == 616){ //fishing
	aClass23Array403[j].anInt405 = 19078;// Model
	aClass23Array403[j].anInt406 = 4952; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}   
   
if(j == 615){ //firemaking
	aClass23Array403[j].anInt405 = 19077;// Model
	aClass23Array403[j].anInt406 = 4976; // animation
	aClass23Array403[j].aClass20_407 = Class20.aClass20Array351[aClass23Array403[j].anInt406];// Update
}


			
        }

    }

    public void method265(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
                anInt405 = class30_sub2_sub2.method410();
            else
            if(i == 2)
            {
                anInt406 = class30_sub2_sub2.method410();
                if(Class20.aClass20Array351 != null)
                    aClass20_407 = Class20.aClass20Array351[anInt406];
            } else
            if(i == 4)
                anInt410 = class30_sub2_sub2.method410();
            else
            if(i == 5)
                anInt411 = class30_sub2_sub2.method410();
            else
            if(i == 6)
                anInt412 = class30_sub2_sub2.method410();
            else
            if(i == 7)
                anInt413 = class30_sub2_sub2.method408();
            else
            if(i == 8)
                anInt414 = class30_sub2_sub2.method408();
            else
            if(i >= 40 && i < 50)
                anIntArray408[i - 40] = class30_sub2_sub2.method410();
            else
            if(i >= 50 && i < 60)
                anIntArray409[i - 50] = class30_sub2_sub2.method410();
            else
                System.out.println("Error unrecognised spotanim config code: " + i);
        } while(true);
    }

    public Class30_Sub2_Sub4_Sub6 method266()
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_415.method222(anInt404);
        if(class30_sub2_sub4_sub6 != null)
            return class30_sub2_sub4_sub6;
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt400, anInt405);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray408[0] != 0)
                class30_sub2_sub4_sub6.method476(anIntArray408[i], anIntArray409[i]);

        aClass12_415.method223(class30_sub2_sub4_sub6, anInt404, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public Class23()
    {
        anInt400 = 9;
        anInt406 = -1;
        anIntArray408 = new int[6];
        anIntArray409 = new int[6];
        anInt410 = 128;
        anInt411 = 128;
    }

    private int anInt400;
    private static boolean aBoolean401 = true;
    public static int anInt402;
    public static Class23 aClass23Array403[];
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public Class20 aClass20_407;
    public int anIntArray408[];
    public int anIntArray409[];
    public int anInt410;
    public int anInt411;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static Class12 aClass12_415 = new Class12(false, 30);

}
