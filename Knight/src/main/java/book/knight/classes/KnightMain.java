package book.knight.classes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class KnightMain {
	ApplicationContext context =
			new ClassPathXmlApplicationContext("knights.xml");
			// ��������� ���������� knight
			Knight knight = (Knight) context.getBean("knight");
			// ������������� ���������� knight
//			knight.embarkOnQuest();
}
