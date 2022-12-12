package HomeworkBean1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Reader reader1 = context.getBean(Reader.class);
        System.out.println(reader1);





    }
}
