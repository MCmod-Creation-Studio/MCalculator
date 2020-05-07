package ceshi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;


public class wenben extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static float a = 0;
	static float b = 1;
	static String c = "";
	static String d = "";
	static String f = "";
	public wenben(){
		
			setSize(500,200);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			Container cp=getContentPane();
			getContentPane().setLayout(new FlowLayout());
			JTextField zero=new JTextField("",0);
			JTextField one=new JTextField("请输入食物饱食度（鸡腿数乘以2,不支持小数)",22);
			JTextField two=new JTextField("请输入此为第几次食用",20);
			JTextField thr=new JTextField("输出魔力(彼方兰缓存上限为9000)",20);
			final JButton jb=new JButton("计算");
			final JButton jb2=new JButton("全清");
			final JTextField zuozhe=new JTextField("作者:Eternal_Unknown，一时兴起而写的屑作，玩的愉快:)",30);
			final JTextField shuoming=new JTextField("更新说明:修复了多个bug，优化体验(",40);	
			cp.add(zero);
			cp.add(one);
			cp.add(two);
			cp.add(jb);
			cp.add(thr);
			cp.add(jb2);
			cp.add(zuozhe);
			cp.add(shuoming);
			
			jb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					c = one.getText();
					d = two.getText();
					Integer a = new Integer(c);
					Integer b = new Integer(d);
					float e =   a * a * 70 / b;
					f = String.valueOf(e);
					thr.setText(f);
					thr.requestFocus();
					if(e > 9000) {
						zuozhe.setText("魔力太多啦，彼方兰弱小的身躯承受不住:(");
							
						
						
					}
					else if(e <= 9000){
						zuozhe.setText("贪食的彼方兰把食物全部消化了哦~");
					}
					if(a == 114514) {
						zuozhe.setText("哼哼啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
					}
				}
			});
			jb2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					one.setText("");
					two.setText("");
					thr.setText("");
					zuozhe.setText("全清了哦");
				}
			});
			one.addFocusListener(new FocusListener(){
				public void focusGained(FocusEvent arg0) {
					one.setText("");
					two.setText("");
					thr.setText("");
					zuozhe.setText("正在输入饱食度...");					
				}

				@Override
				public void focusLost(FocusEvent arg0) {
					
					
				}
				
			});
			two.addFocusListener(new FocusListener(){
				public void focusGained(FocusEvent arg0) {
					
					zuozhe.setText("正在输入第几次食用...");					
				}

				@Override
				public void focusLost(FocusEvent arg0) {
					
					
				}
				
			});
				
			setVisible(true);
		}
		public static void main(String[] args) {
			new wenben();
}}
