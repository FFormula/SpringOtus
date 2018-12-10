import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Exam;

public class Program {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/context.xml");
        context.getBean(Exam.class).start();
    }
}
