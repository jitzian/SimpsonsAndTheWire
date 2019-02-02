
package org.com.castcodechallenge.comcastcodechallenge.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SrcOptions {

    @SerializedName("skip_qr")
    @Expose
    private String skipQr;
    @SerializedName("is_mediawiki")
    @Expose
    private int isMediawiki;
    @SerializedName("directory")
    @Expose
    private String directory;
    @SerializedName("is_fanon")
    @Expose
    private int isFanon;
    @SerializedName("skip_abstract_paren")
    @Expose
    private int skipAbstractParen;
    @SerializedName("skip_icon")
    @Expose
    private int skipIcon;
    @SerializedName("source_skip")
    @Expose
    private String sourceSkip;
    @SerializedName("skip_abstract")
    @Expose
    private int skipAbstract;
    @SerializedName("skip_image_name")
    @Expose
    private int skipImageName;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("is_wikipedia")
    @Expose
    private int isWikipedia;
    @SerializedName("min_abstract_length")
    @Expose
    private String minAbstractLength;
    @SerializedName("skip_end")
    @Expose
    private String skipEnd;
    @SerializedName("src_info")
    @Expose
    private String srcInfo;

    public String getSkipQr() {
        return skipQr;
    }

    public void setSkipQr(String skipQr) {
        this.skipQr = skipQr;
    }

    public int getIsMediawiki() {
        return isMediawiki;
    }

    public void setIsMediawiki(int isMediawiki) {
        this.isMediawiki = isMediawiki;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public int getIsFanon() {
        return isFanon;
    }

    public void setIsFanon(int isFanon) {
        this.isFanon = isFanon;
    }

    public int getSkipAbstractParen() {
        return skipAbstractParen;
    }

    public void setSkipAbstractParen(int skipAbstractParen) {
        this.skipAbstractParen = skipAbstractParen;
    }

    public int getSkipIcon() {
        return skipIcon;
    }

    public void setSkipIcon(int skipIcon) {
        this.skipIcon = skipIcon;
    }

    public String getSourceSkip() {
        return sourceSkip;
    }

    public void setSourceSkip(String sourceSkip) {
        this.sourceSkip = sourceSkip;
    }

    public int getSkipAbstract() {
        return skipAbstract;
    }

    public void setSkipAbstract(int skipAbstract) {
        this.skipAbstract = skipAbstract;
    }

    public int getSkipImageName() {
        return skipImageName;
    }

    public void setSkipImageName(int skipImageName) {
        this.skipImageName = skipImageName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getIsWikipedia() {
        return isWikipedia;
    }

    public void setIsWikipedia(int isWikipedia) {
        this.isWikipedia = isWikipedia;
    }

    public String getMinAbstractLength() {
        return minAbstractLength;
    }

    public void setMinAbstractLength(String minAbstractLength) {
        this.minAbstractLength = minAbstractLength;
    }

    public String getSkipEnd() {
        return skipEnd;
    }

    public void setSkipEnd(String skipEnd) {
        this.skipEnd = skipEnd;
    }

    public String getSrcInfo() {
        return srcInfo;
    }

    public void setSrcInfo(String srcInfo) {
        this.srcInfo = srcInfo;
    }

}
