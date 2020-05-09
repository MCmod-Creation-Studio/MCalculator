package MCalculator;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

class gg extends JDialog{
	static double wen = 0;
	static boolean t = false;
	public gg(MCalculator frame) {
		super(frame,"坩埚计算器",true);
		JComboBox<String> jc = new JComboBox<>(new lb());				
		setSize(400,500);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(getOwner());
		Container cp=getContentPane();
		getContentPane().setLayout(null);
		JLabel jl1 = new JLabel("请选择初始生物群系:");	
		JLabel jl2 = new JLabel("请输入高度");
		JLabel jl3 = new JLabel("起始温度");
		JLabel jl4 = new JLabel("目标温度");
		JLabel jl5 = new JLabel("坩埚质量");
		JLabel jl6 = new JLabel("物料质量");
		JLabel jl7 = new JLabel("燃烧室效率");
		JLabel jl8 = new JLabel("K");
		JLabel jl10 = new JLabel("KG");
		JLabel jl11 = new JLabel("KG");
		JLabel jl12 = new JLabel("%");
		JLabel jl9 = new JLabel("K");
		JLabel jlf = new JLabel("燃烧时间");
		JCheckBox jc1 = new JCheckBox("手动输入起始温度");
		JTextField jt = new JTextField("");
		JTextField jt1 = new JTextField("");
		JTextField jt2= new JTextField("");
		JTextField jt3 = new JTextField("");
		JTextField jt4 = new JTextField("");
		JTextField jt5 = new JTextField("");
		JTextArea ja = new JTextArea("");
		JTextArea ja1 = new JTextArea("");
		JButton js = new JButton("计算");
		ja.setEditable(false);
		ja1.setEditable(false);
		jc1.setBackground(Color.white);
		jc.setBackground(Color.white);
		jl1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		jl1.setBounds(10, 10, 200, 30);
		jl2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		jl2.setBounds(10, 60, 200, 30);
		jt.setBounds(100, 60, 150, 30);
		jc.setBounds(160, 10, 80, 30);
		ja.setBounds(270, 10, 100, 80);
		ja.setFont(new Font("微软雅黑", Font.BOLD, 24));
		jl3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl8.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl9.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl10.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl11.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jl12.setFont(new Font("微软雅黑", Font.BOLD, 20));
		ja1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		jlf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		ja.setLineWrap(true);
		jt5.addFocusListener(new FocusListener(){	
			
			public void focusGained(FocusEvent arg0) {
									
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				double qun = 0;	
				double gao = 0;
				Object g = jc.getSelectedItem();
				String h = jt5.getText();
				Integer q= new Integer(h);
				if(g == "平原") {
					qun=285;
				}else if(g == "森林") {
					qun=284;
				}else if(g == "平顶山") {
					qun=310;					
				}else if(g == "热带草原") {
					qun=294;
				}else if(g == "冰原") {
					qun=270;
				}
				if(q <= 64) {
					gao = 0;
				}else {
					gao = (q - 64)/32 * -1;

				}
				wen = (int) (qun + gao);
				ja.setText(Math.floor(wen)+"K");
				
			}
			
		});
		jc1.setBounds(10,100,200,30);
		jl3.setBounds(10,150,200,30);
		jl4.setBounds(10,200,200,30);
		jl5.setBounds(10,250,200,30);
		jl6.setBounds(10,300,200,30);
		jl7.setBounds(10,350,200,30);
		jt.setBounds(120,152,200,30);
		jt1.setBounds(120,202,200,30);
		jt2.setBounds(120,252,200,30);
		jt3.setBounds(120,302,200,30);
		jt4.setBounds(120,352,200,30);
		jl8.setBounds(340,150,30,30);
		jl9.setBounds(340,200,30,30);
		jl10.setBounds(340,250,30,30);
		jl11.setBounds(340,300,30,30);
		jl12.setBounds(340,350,30,30);
		js.setBounds(200,400,170,60);
		ja1.setBounds(100,400,100,80);
		jlf.setBounds(10,375,100,80);
		jt5.setBounds(100,60,100,30);
		cp.add(jl1);	
		cp.add(jc);	
		cp.add(jl2);
		cp.add(jt);
		cp.add(ja);
		cp.add(jc1);
		cp.add(jl3);
		cp.add(jl4);
		cp.add(jl5);
		cp.add(jl6);
		cp.add(jl7);
		cp.add(jt);
		cp.add(jt1);
		cp.add(jt2);
		cp.add(jt3);
		cp.add(jt4);
		cp.add(jl8);
		cp.add(jl9);
		cp.add(jl10);
		cp.add(jl11);
		cp.add(jl12);
		cp.add(js);
		cp.add(ja1);
		cp.add(jlf);
		cp.add(jt5);
		jt.setEditable(false);		
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(t == false) {					
					t = true;
					jt.setEditable(true);
				}else {
					t = false;
					jt.setEditable(false);
				}
				
			}});
		js.addActionListener(new ActionListener(){		
			public void actionPerformed(ActionEvent arg0) {
				String f = jt.getText();
				String g = jt1.getText();
				String h = jt2.getText();
				String i = jt3.getText();
				String j = jt4.getText();
				Integer u = new Integer(f);
				Integer b = new Integer(g);
				Integer c = new Integer(h);
				Integer d = new Integer(i);
				Integer p = new Integer(j);
				double a = Math.floor(wen);
				
				if(t == false) {
										
					double y = ((b - a)*(c + d) / p) / 25;					
					ja1.setText(Math.ceil(y)+"");
				}else {
										
				double s = ((b - u)*(c + d) / p) / 25;
				ja1.setText(Math.ceil(s)+"");}
				
				
				
			}});
		
			}
					
	

class lb extends AbstractListModel<String> implements ComboBoxModel<String>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selecteditem = null;
	String[] test = {"平原","森林","平顶山","热带草原","冰原"};

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return test[index];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return test.length;
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return selecteditem;
	}

	@Override
	public void setSelectedItem(Object item) {		
		// TODO Auto-generated method stub
		selecteditem=(String)item;
	}
	
}
}

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
		setResizable(false);
		setSize(170,365);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
		setLocationRelativeTo(getOwner());
		setLayout(null);
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
		JButton qq = new JButton("   全清   ");
		jt.setBounds(5,5,155,130);
		jb7.setBounds(6,140,50,30);
		jb8.setBounds(56,140,50,30);
		jb9.setBounds(106,140,50,30);
		jb4.setBounds(6,172,50,30);
		jb5.setBounds(56,172,50,30);
		jb6.setBounds(106,172,50,30);
		jb1.setBounds(6,204,50,30);
		jb2.setBounds(56,204,50,30);
		jb3.setBounds(106,204,50,30);
		jbj.setBounds(6,236,50,30);
		jb0.setBounds(56,236,50,30);
		jbi.setBounds(106,236,50,30);
		jbc.setBounds(6,268,50,30);
		jbu.setBounds(56,268,50,30);
		jbd.setBounds(106,268,50,30);
		qq.setBounds(6,300,150,30);
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
		cp.add(qq);
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
		qq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jt.setText("");
				t = false;
				a = 0;
				b = 0;
				c = "";
				d = "";
				e = "";
				
				
				
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
		setResizable(false);
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
		zuozhe.setEditable(false);
		shuoming.setEditable(false);
		thr.setEditable(false);
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
		setResizable(false);
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
		getContentPane().setBackground(Color.white);
		JLabel jl = new JLabel("                             欢迎使用MCalculator！V0.2            ",JLabel.CENTER);		
		jl.setFont(new Font("微软雅黑", Font.BOLD, 16));
		ImageIcon icon=new ImageIcon("E:\\1.jpg"); 
		setIconImage(icon.getImage());
		JButton pf = new JButton("植物魔法彼方兰计算器");
		JButton gy = new JButton("关于");
		JButton js = new JButton("  简易通用计算器  ");
		JButton gg = new JButton("  GT6坩埚计算器  ");
		cp.add(jl);	
		cp.add(gy);
		cp.add(js);
		cp.add(pf);
		cp.add(gg);
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
		gg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new gg(MCalculator.this).setVisible(true);
			}
		});
		setVisible(true);
	}
	


public static void main(String[] args) {
	new MCalculator();
}}

		