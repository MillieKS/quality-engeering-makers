public class StoryBuilder {

    String plot;
    private String plot2;

    public StoryBuilder(String plot) {
        this.plot = plot;
    }

    public String getPlot() {
        return this.plot;
    }

    public String addPlotline(String plot2) {

        this.plot2 = plot2;
        this.plot = this.plot + this.plot2;
        return this.plot;

    }

    public static void main(String[] args) {
        StoryBuilder myStory = new StoryBuilder("This is the first plot");
        System.out.println(myStory.getPlot());
        myStory.addPlotline("This is the second plot");
        System.out.println(myStory.getPlot());

    }
}
