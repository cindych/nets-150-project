public class DatasetParserMain {
    public static void main (String[] args) {
        
        DatasetParser2 dsParser = new DatasetParser2(); 
        dsParser.makeTopicsMap();
        dsParser.listSetsInTopic("Health / Human Services");
        System.out.println("--------------");
        dsParser.findDescription("Leaf Collection Areas");
        System.out.println("--------------");
        dsParser.findDescription("this should fail");
        System.out.println("--------------");
        
        DatasetParser dsparse = new DatasetParser();
        dsparse.getLinkMap();
        dsparse.findAllTopics("Employee Earnings");
    }
}