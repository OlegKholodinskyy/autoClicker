package clicker.Seosprint;

public class GoCaptcha {
    /*
     public void  passTheCapcha(WebDriver driver){

        driver.switchTo().activeElement();

        String questWord = startPageSeo.getQuestWord();

        List<BufferedImage> listOfImagesFromWebPage = fillListOfImagesFromWeb(startPageSeo);

        List<File> searchingFilesOnDisk = fillListFilesFromDisk(questWord);
        List<BufferedImage> listOfImagesFromDisk = fillListBufferedImagesFromDisk(searchingFilesOnDisk);

        List<BufferedImage> listDownloadad = fillImagesDownloaded();


        System.out.println("Word search " + questWord);
        System.out.println("Size of downloaded " + listDownloadad.size());
        System.out.println("Size of nameMatch " + listOfImagesFromDisk.size());

        Thread.sleep(100);

        byte numberLabel = 1;
        for (BufferedImage picWeb : listDownloadad) {
            for (BufferedImage picDisk : listOfImagesFromDisk) {
                if (compareImages(picWeb, picDisk)) {
                    System.out.println("MATCH ++ " + numberLabel);
                }
            }
            numberLabel++;
        }
    }

    private List<BufferedImage> fillListOfImagesFromWeb(StartPageSeo startPageSeo) throws IOException {
        List<BufferedImage> listOfImagesFromWebPage = new ArrayList<BufferedImage>();

        WebElement[] arrOfPic = startPageSeo.getArrOfImages();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullScreen = ImageIO.read(screenshot);
        byte i = 0;
        for (WebElement picture : arrOfPic) {
            Point location = picture.getLocation();
            int width = picture.getSize().getWidth();
            int height = picture.getSize().getHeight();
            BufferedImage image = fullScreen.getSubimage(location.getX(), location.getY(), width, height);
            listOfImagesFromWebPage.add(image);
            ImageIO.write(image, "png", screenshot);
            FileUtils.copyFile(screenshot, new File(String.format("c://1//%s.png", i++)));
        }
        return listOfImagesFromWebPage;
    }

    private List<File> fillListFilesFromDisk(String questWord) {

        File dir = new File("./src/main/resources/img/");
        File[] files = dir.listFiles();
        List<File> listFilesOnDisk = Arrays.asList(files);

        List<File> nameSearchingList = new ArrayList<File>();

        for (File f : listFilesOnDisk) {
            if (f.getName().contains(questWord)) {
                nameSearchingList.add(f);
            }
        }
        return nameSearchingList;
    }

    public List<BufferedImage> fillListBufferedImagesFromDisk(List<File> nameSearchingList) {
        List<BufferedImage> listOfImagesFromDisk = new ArrayList<BufferedImage>();
        for (File fl : nameSearchingList) {
            try {
                BufferedImage img = ImageIO.read(new File("./src/main/resources/img/" + fl.getName()));
                listOfImagesFromDisk.add(img);
            } catch (IOException e) {
                System.out.println("Can not find File");
            }
        }
        return listOfImagesFromDisk;
    }

    public List<BufferedImage> fillImagesDownloaded () throws IOException {
        List<BufferedImage> listImagesDownloaded = new ArrayList<BufferedImage>();
        File dir = new File("c://1//");
        File[] files = dir.listFiles();
        List<File> listFilesOnDisk = Arrays.asList(files);

        for(File f : listFilesOnDisk){
            BufferedImage img = ImageIO.read(f);
            listImagesDownloaded.add(img);
        }
        return listImagesDownloaded;
    }


    private boolean compareImages(BufferedImage picWeb, BufferedImage picDisk) {
        int rgb= 0;
        if (picWeb.getWidth() != picDisk.getWidth() || picWeb.getWidth() != picDisk.getWidth()) {
            return false;
        }
        for (int x = 1; x < picWeb.getWidth(); x++) {
            for (int y = 1; y < picWeb.getHeight(); y++) {
                    if (picWeb.getRGB(x, y) != picDisk.getRGB(x, y)) {
                    return false;
                }
            }
        }
        return true;
    }
     */
}
