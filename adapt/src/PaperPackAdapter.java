class PaperPackAdapter implements Packaging {
    private OldPaperPack oldPaperPack;

    public PaperPackAdapter(OldPaperPack oldPaperPack) {
        this.oldPaperPack = oldPaperPack;
    }

    @Override
    public void pack(String fruitName) {

        oldPaperPack.wrapPaper(fruitName);
    }
}