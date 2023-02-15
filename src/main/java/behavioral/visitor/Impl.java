package behavioral.visitor;

import java.util.List;

public class Impl {

    public void visitAll(){
        MessagingVisitor visitor = new MessagingVisitor();
        visitor.sendMails(List.of(
                new Restaurant("Caffe", "Diagonal alley", "123456789", true),
                new Company("Devpro", "Bydgoszcz", "234687654", 10)
                ));
    }

    public void visitSingle(){
        Company company = new Company("Devpro", "Bydgoszcz", "234687654", 10);
        company.accept(new MessagingVisitor());
    }
}
