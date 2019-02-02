
package org.com.castcodechallenge.comcastcodechallenge.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharactersResult {

    @SerializedName("DefinitionURL")
    @Expose
    private String definitionURL;
    @SerializedName("RelatedTopics")
    @Expose
    private List<RelatedTopic> relatedTopics = null;
    @SerializedName("AbstractURL")
    @Expose
    private String abstractURL;
    @SerializedName("ImageIsLogo")
    @Expose
    private int imageIsLogo;
    @SerializedName("Entity")
    @Expose
    private String entity;
    @SerializedName("Results")
    @Expose
    private List<Object> results = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("AbstractSource")
    @Expose
    private String abstractSource;
    @SerializedName("DefinitionSource")
    @Expose
    private String definitionSource;
    @SerializedName("AbstractText")
    @Expose
    private String abstractText;
    @SerializedName("AnswerType")
    @Expose
    private String answerType;
    @SerializedName("Answer")
    @Expose
    private String answer;
    @SerializedName("ImageWidth")
    @Expose
    private int imageWidth;
    @SerializedName("Infobox")
    @Expose
    private String infobox;
    @SerializedName("Heading")
    @Expose
    private String heading;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Redirect")
    @Expose
    private String redirect;
    @SerializedName("ImageHeight")
    @Expose
    private int imageHeight;
    @SerializedName("Abstract")
    @Expose
    private String _abstract;
    @SerializedName("Definition")
    @Expose
    private String definition;

    public String getDefinitionURL() {
        return definitionURL;
    }

    public void setDefinitionURL(String definitionURL) {
        this.definitionURL = definitionURL;
    }

    public List<RelatedTopic> getRelatedTopics() {
        return relatedTopics;
    }

    public void setRelatedTopics(List<RelatedTopic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public String getAbstractURL() {
        return abstractURL;
    }

    public void setAbstractURL(String abstractURL) {
        this.abstractURL = abstractURL;
    }

    public int getImageIsLogo() {
        return imageIsLogo;
    }

    public void setImageIsLogo(int imageIsLogo) {
        this.imageIsLogo = imageIsLogo;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public List<Object> getResults() {
        return results;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getAbstractSource() {
        return abstractSource;
    }

    public void setAbstractSource(String abstractSource) {
        this.abstractSource = abstractSource;
    }

    public String getDefinitionSource() {
        return definitionSource;
    }

    public void setDefinitionSource(String definitionSource) {
        this.definitionSource = definitionSource;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getInfobox() {
        return infobox;
    }

    public void setInfobox(String infobox) {
        this.infobox = infobox;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}
