// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import sign.signlink;


public class Applet_Sub1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener{

    public final void method1(int i, boolean flag, int j){
        anInt10 = j;
        anInt11 = i;
        if(flag){
            return;
        } else{
            aFrame_Sub1_15 = new Frame_Sub1(this, anInt10, (byte)5, anInt11);
            aGraphics12 = method11(0).getGraphics();
            aClass15_13 = new Class15(anInt10, anInt11, method11(0), 0);
            method12(this, 1);
            return;
        }
    }

    public final void method2(int i, boolean flag, int j){
        anInt10 = j;
        anInt11 = i;
        aGraphics12 = method11(0).getGraphics();
        aClass15_13 = new Class15(anInt10, anInt11, method11(0), 0);
        method12(this, 1);
        if(!flag);
    }

    public void run(){
        method11(0).addMouseListener(this);
        method11(0).addMouseMotionListener(this);
        method11(0).addKeyListener(this);
        method11(0).addFocusListener(this);
        if(aFrame_Sub1_15 != null)
            aFrame_Sub1_15.addWindowListener(this);
        method13(0, (byte)4, "Loading...");
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
            aLongArray7[k1] = System.currentTimeMillis();
        long l = System.currentTimeMillis();
        while(anInt4 >= 0) {
            if(anInt4 > 0){
                anInt4--;
                if(anInt4 == 0){
                    method3(4747);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if(aLongArray7[i] == 0L){
                j = i2;
                k = j2;
            } else if(l1 > aLongArray7[i])
                j = (int)((long)(2560 * anInt5) / (l1 - aLongArray7[i]));
            if(j < 25)
                j = 25;
            if(j > 256){
                j = 256;
                k = (int)((long)anInt5 - (l1 - aLongArray7[i]) / 10L);
            }
            if(k > anInt5)
                k = anInt5;
            aLongArray7[i] = l1;
            i = (i + 1) % 10;
            if(k > 1){
                for(int k2 = 0; k2 < 10; k2++)
                    if(aLongArray7[k2] != 0L)
                        aLongArray7[k2] += k;
            }
            if(k < anInt6)
                k = anInt6;
            try{
                Thread.sleep(k);
            } catch(InterruptedException _ex){
                j1++;
            }
            for(; i1 < 256; i1 += j){
                anInt26 = anInt22;
                anInt27 = anInt23;
                anInt28 = anInt24;
                aLong29 = aLong25;
                anInt22 = 0;
                method7(24869);
                anInt32 = anInt33;
            }
            i1 &= 0xff;
            if(anInt5 > 0)
                anInt8 = (1000 * j) / (anInt5 * 256);
            method9(0);
            if(aBoolean9){
                System.out.println("ntime:" + l1);
                for(int l2 = 0; l2 < 10; l2++){
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray7[i3]);
                }
                System.out.println("fps:" + anInt8 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt5 + " mindel:" + anInt6);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean9 = false;
                j1 = 0;
            }
        }
        if(anInt4 == -1)
            method3(4747);
    }

    public final void method3(int i){
        anInt4 = -2;
        method8(493);
        if(i != 4747)
            return;
        if(aFrame_Sub1_15 != null){
            try{
                Thread.sleep(1000L);
            }catch(Exception _ex) {

			}
            try{
                System.exit(0);
                return;
            }catch(Throwable _ex) {

			}
        }
    }

    public final void method4(boolean flag, int i){
        if(flag){
            return;
        } else{
            anInt5 = 1000 / i;
            return;
        }
    }

    public final void start(){
        if(anInt4 >= 0)
            anInt4 = 0;
    }

    public final void stop(){
        if(anInt4 >= 0)
            anInt4 = 4000 / anInt5;
    }

    public final void destroy(){
        anInt4 = -1;
        try{
            Thread.sleep(5000L);
        }catch(Exception _ex) {

		}
        if(anInt4 == -1)
            method3(4747);
    }

    public final void update(Graphics g){
        if(aGraphics12 == null)
            aGraphics12 = g;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void paint(Graphics g){
        if(aGraphics12 == null)
            aGraphics12 = g;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void mousePressed(MouseEvent mouseevent){
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_15 != null){
            i -= 4;
            j -= 22;
        }
        anInt18 = 0;
        anInt23 = i;
        anInt24 = j;
        aLong25 = System.currentTimeMillis();
        if(mouseevent.isMetaDown()){
            anInt22 = 2;
            anInt19 = 2;
            return;
        } else{
            anInt22 = 1;
            anInt19 = 1;
            return;
        }
    }

    public final void mouseReleased(MouseEvent mouseevent){
        anInt18 = 0;
        anInt19 = 0;
    }

    public final void mouseClicked(MouseEvent mouseevent){
    }

    public final void mouseEntered(MouseEvent mouseevent){
    }

    public final void mouseExited(MouseEvent mouseevent){
        anInt18 = 0;
        anInt20 = -1;
        anInt21 = -1;
    }

    public final void mouseDragged(MouseEvent mouseevent){
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_15 != null){
            i -= 4;
            j -= 22;
        }
        anInt18 = 0;
        anInt20 = i;
        anInt21 = j;
    }

    public final void mouseMoved(MouseEvent mouseevent){
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_15 != null){
            i -= 4;
            j -= 22;
        }
        anInt18 = 0;
        anInt20 = i;
        anInt21 = j;
    }

    public final void keyPressed(KeyEvent keyevent){
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
		if(i == KeyEvent.VK_ESCAPE) {
			client.aBoolean1153 = true;
			client.anInt1221 = 0;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F1) {
			client.aBoolean1153 = true;
			client.anInt1221 = 1;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F2) {
			client.aBoolean1153 = true;
			client.anInt1221 = 2;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F3) {
			client.aBoolean1153 = true;
			client.anInt1221 = 3;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F4) {
			client.aBoolean1153 = true;
			client.anInt1221 = 4;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F5) {
			client.aBoolean1153 = true;
			client.anInt1221 = 5;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F6) {
			client.aBoolean1153 = true;
			client.anInt1221 = 6;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F7) {
			client.aBoolean1153 = true;
			client.anInt1221 = 8;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F8) {
			client.aBoolean1153 = true;
			client.anInt1221 = 9;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F9) {
			client.aBoolean1153 = true;
			client.anInt1221 = 10;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F10) {
			client.aBoolean1153 = true;
			client.anInt1221 = 11;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F11) {
			client.aBoolean1153 = true;
			client.anInt1221 = 12;
			client.aBoolean1103 = true;
		}
		if(i == KeyEvent.VK_F12) {
			client.aBoolean1153 = true;
			client.anInt1221 = 13;
			client.aBoolean1103 = true;
		}
        if(j < 30)
            j = 0;
        if(i == 37)
            j = 1;
        if(i == 39)
            j = 2;
        if(i == 38)
            j = 3;
        if(i == 40)
            j = 4;
        if(i == 17)
            j = 5;
        if(i == 8)
            j = 8;
        if(i == 127)
            j = 8;
        if(i == 9)
            j = 9;
        if(i == 10)
            j = 10;
        if(i >= 112 && i <= 123)
            j = (1008 + i) - 112;
        if(i == 36)
            j = 1000;
        if(i == 35)
            j = 1001;
        if(i == 33)
            j = 1002;
        if(i == 34)
            j = 1003;
        if(j > 0 && j < 128)
            anIntArray30[j] = 1;
        if(j > 4) {
            anIntArray31[anInt33] = j;
            anInt33 = anInt33 + 1 & 0x7f;
        }
    }

    public final void keyReleased(KeyEvent keyevent){
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if(c < '\036')
            c = '\0';
        if(i == 37)
            c = '\001';
        if(i == 39)
            c = '\002';
        if(i == 38)
            c = '\003';
        if(i == 40)
            c = '\004';
        if(i == 17)
            c = '\005';
        if(i == 8)
            c = '\b';
        if(i == 127)
            c = '\b';
        if(i == 9)
            c = '\t';
        if(i == 10)
            c = '\n';
        if(c > 0 && c < '\200')
            anIntArray30[c] = 0;
    }

    public final void keyTyped(KeyEvent keyevent){
    }

    public final int method5(int i){
        while(i >= 0) {
            for(int j = 1; j > 0; j++);
        }
        int k = -1;
        if(anInt33 != anInt32){
            k = anIntArray31[anInt32];
            anInt32 = anInt32 + 1 & 0x7f;
        }
        return k;
    }

    public final void focusGained(FocusEvent focusevent) {
        aBoolean17 = true;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void focusLost(FocusEvent focusevent){
        aBoolean17 = false;
        for(int i = 0; i < 128; i++)
            anIntArray30[i] = 0;
    }

    public final void windowActivated(WindowEvent windowevent){
    }

    public final void windowClosed(WindowEvent windowevent){
    }

    public final void windowClosing(WindowEvent windowevent){
        destroy();
    }

    public final void windowDeactivated(WindowEvent windowevent){
    }

    public final void windowDeiconified(WindowEvent windowevent){
    }

    public final void windowIconified(WindowEvent windowevent){
    }

    public final void windowOpened(WindowEvent windowevent){
    }

    public void method6(){
    }

    public void method7(int i){
        if(i == anInt2);
    }

    public void method8(int i){
        i = 91 / i;
    }

    public void method9(int i){
        if(i != 0){
            for(int j = 1; j > 0; j++);
        }
    }

    public void method10(byte byte0){
        if(byte0 == 1)
            byte0 = 0;
    }

    public Component method11(int i){
        if(i != 0){
            for(int j = 1; j > 0; j++);
        }
        if(aFrame_Sub1_15 != null)
            return aFrame_Sub1_15;
        else
            return this;
    }

    public void method12(Runnable runnable, int i){
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void method13(int i, byte byte0, String s){ //the start up bar
        while(aGraphics12 == null) {
            aGraphics12 = method11(0).getGraphics();
            try{
                method11(0).repaint();
            }catch(Exception _ex) { 
			
			}
            try{
                Thread.sleep(1000L);
            }catch(Exception _ex) {

			}
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = method11(0).getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        method11(0).getFontMetrics(font1);
        if(aBoolean16){
            aGraphics12.setColor(Color.black);
            aGraphics12.fillRect(0, 0, anInt10, anInt11);
            aBoolean16 = false;
        }
        Color color = new Color(140, 17, 17);
        int j = anInt11 / 2 - 18;
        aGraphics12.setColor(color);
        aGraphics12.drawRect(anInt10 / 2 - 152, j, 304, 34);
        aGraphics12.fillRect(anInt10 / 2 - 150, j + 2, i * 3, 30);
        aGraphics12.setColor(Color.black);//black
        if(byte0 != 4){
            return;
        } else{
            aGraphics12.fillRect((anInt10 / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
            aGraphics12.setFont(font);
            aGraphics12.setColor(Color.white);
            aGraphics12.drawString(s, (anInt10 - fontmetrics.stringWidth(s)) / 2, j + 22);
            return;
        }
    }

    public Applet_Sub1(){
        aBoolean1 = true;
        anInt2 = 24869;
        anInt3 = 748;
        anInt5 = 20;
        anInt6 = 1;
        aLongArray7 = new long[10];
        aBoolean9 = false;
        aClass30_Sub2_Sub1_Sub1Array14 = new Class30_Sub2_Sub1_Sub1[6];
        aBoolean16 = true;
        aBoolean17 = true;
        anIntArray30 = new int[128];
        anIntArray31 = new int[128];
    }

    private boolean aBoolean1;
    private int anInt2;
    private int anInt3;
    private int anInt4;
    private int anInt5;
    public int anInt6;
    private long aLongArray7[];
    public int anInt8;
    public boolean aBoolean9;
    public int anInt10;
    public int anInt11;
    public Graphics aGraphics12;
    public Class15 aClass15_13;
    public Class30_Sub2_Sub1_Sub1 aClass30_Sub2_Sub1_Sub1Array14[];
    public Frame_Sub1 aFrame_Sub1_15;
    public boolean aBoolean16;
    public boolean aBoolean17;
    public int anInt18;
    public int anInt19;
    public int anInt20;
    public int anInt21;
    public int anInt22;
    public int anInt23;
    public int anInt24;
    public long aLong25;
    public int anInt26;
    public int anInt27;
    public int anInt28;
    public long aLong29;
    public int anIntArray30[];
    private int anIntArray31[];
    private int anInt32;
    private int anInt33;
    public static int anInt34;
}
