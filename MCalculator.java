package MCalculator;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;
class js extends JDialog{
	static double a = 0;
	static double b = 0;
	static String c = "";
	static String d = "";
	static String e = "";
	boolean t = false;
	public js(MCalculator frame) {
		super(frame,"简易通用计算器",true);
		Container cp = getContentPane();
		setSize(180,350);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
		setLocationRelativeTo(getOwner());
		getContentPane().setLayout(new FlowLayout());
		JTextArea jt = new JTextArea ("",6,9);
		jt.setLineWrap(true);
		jt.setFont(new Font("微软雅黑", Font.BOLD, 16));
		jt.setEditable(false);
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jbj = new JButton("+");
		JButton jb0 = new JButton("0");
		JButton jbi = new JButton("-");
		JButton jbc = new JButton("×");
		JButton jbu = new JButton("/");
		JButton jbd = new JButton("=");
		cp.add(jt);
		cp.add(jb7);
		cp.add(jb8);
		cp.add(jb9);
		cp.add(jb4);
		cp.add(jb5);
		cp.add(jb6);
		cp.add(jb1);
		cp.add(jb2);
		cp.add(jb3);
		cp.add(jbj);
		cp.add(jb0);
		cp.add(jbi);
		cp.add(jbc);
		cp.add(jbu);
		cp.add(jbd);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("1");
				
			}
		});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("2");
				
			}
		});
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("3");
				
			}
		});
		jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("4");
				
			}
		});
		jb5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("5");
				
			}
		});
		jb6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("6");
				
			}
		});
		jb7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("7");
				
			}
		});
		jb8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("8");
				
			}
		});
		jb9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("9");
				
			}
		});
		jb0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(t == true) {
					jt.setText("");
					t = false;
					}
				jt.append("0");
				
			}
		});
		jbj.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c = jt.getText();
				e = "+";
				jt.setText("");
			}
		});
		jbi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c = jt.getText();
				e = "-";
				jt.setText("");
				
			}
		});
		jbc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c = jt.getText();
				e = "*";
				jt.setText("");
				
			}
		});
		jbu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				c = jt.getText();
				e = "/";
				jt.setText("");
				
			}
				
		});
		jbd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				d = jt.getText();
				Integer a = new Integer(c);
				Integer b = new Integer(d);
				int f = 0;
				int h = 0;
				int i = 0;
				int j = 0;
				int k = 0;				
				String g = "";
				String x = "";
				String y = "";
				String z = "";
				String r = "";
				f = a + b;
				h = a - b;
				i = a * b;
				k = a % b;
				j = (a - k) / b;				
				g = String.valueOf(f);
				x = String.valueOf(h);
				y = String.valueOf(i);
				z = String.valueOf(j);
				r = String.valueOf(k);
				t = true;
				if(e == "+") {					
					jt.setText(c+" + "+d+" = "+g);
					a = 0;
					b = 0;
					f = 0;
					c = "";
					d = "";
					e = "";
							
				}else if(e == "-") {					
					jt.setText(c+" - "+d+" = "+x);
					a = 0;
					b = 0;
					f = 0;
					c = "";
					d = "";
					e = "";
							
					
				}else if(e == "*") {					
					jt.setText(c+" X "+d+" = "+y);
					a = 0;
					b = 0;
					f = 0;
					c = "";
					d = "";
					e = "";
				
				
			}else if(e == "/") {				
				jt.setText(c+" / "+d+" = "+z+" 余 "+r);
				a = 0;
				b = 0;
				f = 0;
				c = "";
				d = "";
				e = "";
			}
				}
		});

	}
}
class bf extends JDialog{
	static double a = 0;
	static double b = 1;
	static String c = "";
	static String d = "";
	static String f = "";
	public bf(MCalculator frame) {
		super(frame,"彼方兰计算器",true);
		Container cp=getContentPane();
		setLocationRelativeTo(getOwner());
		setSize(500,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);		
		getContentPane().setLayout(new FlowLayout());
		JTextField zero=new JTextField("",0);
		JTextField one=new JTextField("请输入食物饱食度（鸡腿数乘以2,不支持小数)",22);
		JTextField two=new JTextField("请输入此为第几次食用",20);
		JTextField thr=new JTextField("输出魔力(彼方兰缓存上限为9000)",20);
		final JButton jb=new JButton("计算");
		final JButton jb2=new JButton("全清");
		final JTextField zuozhe=new JTextField("一时兴起而写的屑作，玩的愉快:)",30);
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
				double e =   a * a * 70 / b;
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
	}
}
class gy extends JDialog{
	String url = "https://www.mcmod.cn";
	String url1 = "https://jq.qq.com/?_wv=1027&k=5FRtSnF";
	public gy(MCalculator frame) {
		super(frame,"关于",true);
		Container cp=getContentPane();
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        setLocationRelativeTo(getOwner());
        JLabel jl1 = new JLabel("<html>作者:Eternal_Unknown<br/>来自MC百科开发组<br/>如果你想要成为我们的一员的话<br/>请加群并写明你的来意<br/>本人Java初学者，难免有些错误<br/>望见谅！");
        JButton qun = new JButton("MC百科");
        JButton qun1 = new JButton("加入我们");
        cp.add(jl1);
        cp.add(qun);
        cp.add(qun1);
        qun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+url);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
        qun1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+url1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			});


	}
}
public class MCalculator extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MCalculator() {
		setTitle("MCalculator");
		setSize(600,800);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(getOwner());
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		JLabel jl = new JLabel("                             欢迎使用MCalculator！            ",JLabel.CENTER);		
		jl.setFont(new Font("微软雅黑", Font.BOLD, 16));
		ImageIcon icon=new ImageIcon("E:\\1.jpg"); 
		setIconImage(icon.getImage());
		JButton pf = new JButton("植物魔法彼方兰计算器");
		JButton gy = new JButton("关于");
		JButton js = new JButton("  简易通用计算器  ");
		cp.add(jl);	
		cp.add(gy);
		cp.add(js);
		cp.add(pf);		
		pf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bf(MCalculator.this).setVisible(true);
			}
		});
		gy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new gy(MCalculator.this).setVisible(true);
			}
		});
		js.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new js(MCalculator.this).setVisible(true);
			}
		});
		setVisible(true);
	}
	


public static void main(String[] args) {
	new MCalculator();
}}

		