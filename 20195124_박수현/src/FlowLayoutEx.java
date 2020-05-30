import javax.swing.*;
import java.awt.*;



public class FlowLayoutEx extends JFrame{
Container c;
public FlowLayoutEx() {
	setTitle("20195124_�ڼ���(Practice6)");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c  = getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

	c.add(new JButton("��ư"));
	
	

	ImageIcon cherryIcon = new ImageIcon("C:\\Users\\aubep\\Pictures/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\aubep\\Pictures/selectedcherry.jpg");
	JCheckBox apple = new JCheckBox("���");
	JCheckBox pear = new JCheckBox("��",true);
	JCheckBox cherry = new JCheckBox("ü��",cherryIcon);
	cherry.setBorderPainted(true);
	cherry.setSelectedIcon(selectedCherryIcon);
	
	c.add(apple);
	c.add(pear);
	c.add(cherry);

	

ImageIcon cherryIcons = new ImageIcon("C:\\Users\\aubep\\Pictures/cherry.jpg");
ImageIcon selectedCherryIcons = new ImageIcon("C:\\Users\\aubep\\Pictures/selectedcherry.jpg");
ButtonGroup g = new ButtonGroup();
JRadioButton apples = new JRadioButton("���");
JRadioButton pears = new JRadioButton("��",true);
JRadioButton cherries = new JRadioButton("ü��",cherryIcons);

cherries.setBorderPainted(true);
cherries.setSelectedIcon(selectedCherryIcons);

g.add(apples);
g.add(pears);
g.add(cherries);

c.add(apples);
c.add(pears);
c.add(cherries);


JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
slider.setPaintLabels(true);
slider.setPaintTicks(true);
slider.setPaintTrack(true);
slider.setMajorTickSpacing(50);
slider.setMajorTickSpacing(10);
c.add(slider);


c.add(new JLabel("�̸�: "));
c.add(new JTextField(10));
c.add(new JLabel("�а�: "));
c.add(new JTextField("��ǻ�Ͱ��а�(����)"));
c.add(new JLabel("�ּ�: "));
c.add(new JTextField("����� ...",20));

JLabel a = new JLabel("Enter the password:");
a.setBounds(20,75,80,30);
JPasswordField value = new JPasswordField(20);
value.setBounds(100,75, 100, 30);
c.add(a);
c.add(value);




JLabel b = new JLabel("Month: ");
String months[] = { "January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November",
        "December" };
SpinnerModel model = new SpinnerListModel(months);
JSpinner spinner = new JSpinner(model);

c.add(b);
c.add(spinner);

JTextArea ta= new JTextArea("hello", 7, 20);
add(ta);
add(new JScrollPane(ta));


String [] fruits = {"apple", "banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
String [] names = {"kitae", "namjoon", "IU"};

JComboBox combo = new JComboBox(fruits);
c.add(combo);

JComboBox nameCombo = new JComboBox();
for(int i=0; i<names.length;i++)
nameCombo.addItem(names[i]);
c.add(nameCombo);

ImageIcon [] images = {new ImageIcon("C:\\\\Users\\\\aubep\\\\Pictures/house.jpg"), 
		new ImageIcon("C:\\\\Users\\\\aubep\\\\Pictures/search.jpg"),
		new ImageIcon("C:\\\\Users\\\\aubep\\\\Pictures/wifi.png"),
		new ImageIcon("C:\\\\Users\\\\aubep\\\\Pictures/key.jpg")
		};
JList List = new JList(fruits);
c.add(List);

JList imageList = new JList();
imageList.setListData(images);
c.add(imageList);

JList scrollList = new JList(fruits);
c.add(new JScrollPane(scrollList));


	setSize(500,500);
	setVisible(true);
	}

	


	public static void main(String[] args) {
	new FlowLayoutEx();

	}

}

