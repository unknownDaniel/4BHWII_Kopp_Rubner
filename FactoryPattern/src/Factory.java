
    public class Factory {
        public static void main(String[] args) {
            Briefumschläge brf1 = BriefumschlägeFactory.getBriefumschläge("A4", "20g");
            Briefumschläge brf2 = BriefumschlägeFactory.getBriefumschläge("A5", null);
            Briefumschläge brf3 = BriefumschlägeFactory.getBriefumschläge("A6", "5");
            Briefumschläge brf4 = BriefumschlägeFactory.getBriefumschläge(null, "250");


            System.out.println(brf1);
            System.out.println(brf2);
            System.out.println(brf3);
            System.out.println(brf4);
        }

}
