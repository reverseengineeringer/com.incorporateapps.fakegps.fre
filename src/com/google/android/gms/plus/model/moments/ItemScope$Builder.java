package com.google.android.gms.plus.model.moments;

import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemScope$Builder
{
  private String mName;
  private String zzF;
  private String zzJN;
  private double zzaNF;
  private double zzaNG;
  private String zzaxl;
  private final Set zzbeN = new HashSet();
  private ItemScopeEntity zzbeO;
  private List zzbeP;
  private ItemScopeEntity zzbeQ;
  private String zzbeR;
  private String zzbeS;
  private String zzbeT;
  private List zzbeU;
  private int zzbeV;
  private List zzbeW;
  private ItemScopeEntity zzbeX;
  private List zzbeY;
  private String zzbeZ;
  private String zzbfA;
  private String zzbfB;
  private String zzbfC;
  private ItemScopeEntity zzbfD;
  private String zzbfE;
  private String zzbfF;
  private String zzbfG;
  private String zzbfH;
  private String zzbfa;
  private ItemScopeEntity zzbfb;
  private String zzbfc;
  private String zzbfd;
  private List zzbfe;
  private String zzbff;
  private String zzbfg;
  private String zzbfh;
  private String zzbfi;
  private String zzbfj;
  private String zzbfk;
  private String zzbfl;
  private String zzbfm;
  private ItemScopeEntity zzbfn;
  private String zzbfo;
  private String zzbfp;
  private String zzbfq;
  private ItemScopeEntity zzbfr;
  private ItemScopeEntity zzbfs;
  private ItemScopeEntity zzbft;
  private List zzbfu;
  private String zzbfv;
  private String zzbfw;
  private String zzbfx;
  private String zzbfy;
  private ItemScopeEntity zzbfz;
  private String zztZ;
  private String zzyv;
  
  public ItemScope build()
  {
    return new ItemScopeEntity(zzbeN, zzbeO, zzbeP, zzbeQ, zzbeR, zzbeS, zzbeT, zzbeU, zzbeV, zzbeW, zzbeX, zzbeY, zzbeZ, zzbfa, zzbfb, zzbfc, zzbfd, zztZ, zzbfe, zzbff, zzbfg, zzbfh, zzaxl, zzbfi, zzbfj, zzbfk, zzbfl, zzbfm, zzbfn, zzbfo, zzbfp, zzyv, zzbfq, zzbfr, zzaNF, zzbfs, zzaNG, mName, zzbft, zzbfu, zzbfv, zzbfw, zzbfx, zzbfy, zzbfz, zzbfA, zzbfB, zzbfC, zzbfD, zzbfE, zzbfF, zzJN, zzF, zzbfG, zzbfH);
  }
  
  public Builder setAbout(ItemScope paramItemScope)
  {
    zzbeO = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(2));
    return this;
  }
  
  public Builder setAdditionalName(List paramList)
  {
    zzbeP = paramList;
    zzbeN.add(Integer.valueOf(3));
    return this;
  }
  
  public Builder setAddress(ItemScope paramItemScope)
  {
    zzbeQ = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(4));
    return this;
  }
  
  public Builder setAddressCountry(String paramString)
  {
    zzbeR = paramString;
    zzbeN.add(Integer.valueOf(5));
    return this;
  }
  
  public Builder setAddressLocality(String paramString)
  {
    zzbeS = paramString;
    zzbeN.add(Integer.valueOf(6));
    return this;
  }
  
  public Builder setAddressRegion(String paramString)
  {
    zzbeT = paramString;
    zzbeN.add(Integer.valueOf(7));
    return this;
  }
  
  public Builder setAssociated_media(List paramList)
  {
    zzbeU = paramList;
    zzbeN.add(Integer.valueOf(8));
    return this;
  }
  
  public Builder setAttendeeCount(int paramInt)
  {
    zzbeV = paramInt;
    zzbeN.add(Integer.valueOf(9));
    return this;
  }
  
  public Builder setAttendees(List paramList)
  {
    zzbeW = paramList;
    zzbeN.add(Integer.valueOf(10));
    return this;
  }
  
  public Builder setAudio(ItemScope paramItemScope)
  {
    zzbeX = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(11));
    return this;
  }
  
  public Builder setAuthor(List paramList)
  {
    zzbeY = paramList;
    zzbeN.add(Integer.valueOf(12));
    return this;
  }
  
  public Builder setBestRating(String paramString)
  {
    zzbeZ = paramString;
    zzbeN.add(Integer.valueOf(13));
    return this;
  }
  
  public Builder setBirthDate(String paramString)
  {
    zzbfa = paramString;
    zzbeN.add(Integer.valueOf(14));
    return this;
  }
  
  public Builder setByArtist(ItemScope paramItemScope)
  {
    zzbfb = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(15));
    return this;
  }
  
  public Builder setCaption(String paramString)
  {
    zzbfc = paramString;
    zzbeN.add(Integer.valueOf(16));
    return this;
  }
  
  public Builder setContentSize(String paramString)
  {
    zzbfd = paramString;
    zzbeN.add(Integer.valueOf(17));
    return this;
  }
  
  public Builder setContentUrl(String paramString)
  {
    zztZ = paramString;
    zzbeN.add(Integer.valueOf(18));
    return this;
  }
  
  public Builder setContributor(List paramList)
  {
    zzbfe = paramList;
    zzbeN.add(Integer.valueOf(19));
    return this;
  }
  
  public Builder setDateCreated(String paramString)
  {
    zzbff = paramString;
    zzbeN.add(Integer.valueOf(20));
    return this;
  }
  
  public Builder setDateModified(String paramString)
  {
    zzbfg = paramString;
    zzbeN.add(Integer.valueOf(21));
    return this;
  }
  
  public Builder setDatePublished(String paramString)
  {
    zzbfh = paramString;
    zzbeN.add(Integer.valueOf(22));
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    zzaxl = paramString;
    zzbeN.add(Integer.valueOf(23));
    return this;
  }
  
  public Builder setDuration(String paramString)
  {
    zzbfi = paramString;
    zzbeN.add(Integer.valueOf(24));
    return this;
  }
  
  public Builder setEmbedUrl(String paramString)
  {
    zzbfj = paramString;
    zzbeN.add(Integer.valueOf(25));
    return this;
  }
  
  public Builder setEndDate(String paramString)
  {
    zzbfk = paramString;
    zzbeN.add(Integer.valueOf(26));
    return this;
  }
  
  public Builder setFamilyName(String paramString)
  {
    zzbfl = paramString;
    zzbeN.add(Integer.valueOf(27));
    return this;
  }
  
  public Builder setGender(String paramString)
  {
    zzbfm = paramString;
    zzbeN.add(Integer.valueOf(28));
    return this;
  }
  
  public Builder setGeo(ItemScope paramItemScope)
  {
    zzbfn = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(29));
    return this;
  }
  
  public Builder setGivenName(String paramString)
  {
    zzbfo = paramString;
    zzbeN.add(Integer.valueOf(30));
    return this;
  }
  
  public Builder setHeight(String paramString)
  {
    zzbfp = paramString;
    zzbeN.add(Integer.valueOf(31));
    return this;
  }
  
  public Builder setId(String paramString)
  {
    zzyv = paramString;
    zzbeN.add(Integer.valueOf(32));
    return this;
  }
  
  public Builder setImage(String paramString)
  {
    zzbfq = paramString;
    zzbeN.add(Integer.valueOf(33));
    return this;
  }
  
  public Builder setInAlbum(ItemScope paramItemScope)
  {
    zzbfr = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(34));
    return this;
  }
  
  public Builder setLatitude(double paramDouble)
  {
    zzaNF = paramDouble;
    zzbeN.add(Integer.valueOf(36));
    return this;
  }
  
  public Builder setLocation(ItemScope paramItemScope)
  {
    zzbfs = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(37));
    return this;
  }
  
  public Builder setLongitude(double paramDouble)
  {
    zzaNG = paramDouble;
    zzbeN.add(Integer.valueOf(38));
    return this;
  }
  
  public Builder setName(String paramString)
  {
    mName = paramString;
    zzbeN.add(Integer.valueOf(39));
    return this;
  }
  
  public Builder setPartOfTVSeries(ItemScope paramItemScope)
  {
    zzbft = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(40));
    return this;
  }
  
  public Builder setPerformers(List paramList)
  {
    zzbfu = paramList;
    zzbeN.add(Integer.valueOf(41));
    return this;
  }
  
  public Builder setPlayerType(String paramString)
  {
    zzbfv = paramString;
    zzbeN.add(Integer.valueOf(42));
    return this;
  }
  
  public Builder setPostOfficeBoxNumber(String paramString)
  {
    zzbfw = paramString;
    zzbeN.add(Integer.valueOf(43));
    return this;
  }
  
  public Builder setPostalCode(String paramString)
  {
    zzbfx = paramString;
    zzbeN.add(Integer.valueOf(44));
    return this;
  }
  
  public Builder setRatingValue(String paramString)
  {
    zzbfy = paramString;
    zzbeN.add(Integer.valueOf(45));
    return this;
  }
  
  public Builder setReviewRating(ItemScope paramItemScope)
  {
    zzbfz = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(46));
    return this;
  }
  
  public Builder setStartDate(String paramString)
  {
    zzbfA = paramString;
    zzbeN.add(Integer.valueOf(47));
    return this;
  }
  
  public Builder setStreetAddress(String paramString)
  {
    zzbfB = paramString;
    zzbeN.add(Integer.valueOf(48));
    return this;
  }
  
  public Builder setText(String paramString)
  {
    zzbfC = paramString;
    zzbeN.add(Integer.valueOf(49));
    return this;
  }
  
  public Builder setThumbnail(ItemScope paramItemScope)
  {
    zzbfD = ((ItemScopeEntity)paramItemScope);
    zzbeN.add(Integer.valueOf(50));
    return this;
  }
  
  public Builder setThumbnailUrl(String paramString)
  {
    zzbfE = paramString;
    zzbeN.add(Integer.valueOf(51));
    return this;
  }
  
  public Builder setTickerSymbol(String paramString)
  {
    zzbfF = paramString;
    zzbeN.add(Integer.valueOf(52));
    return this;
  }
  
  public Builder setType(String paramString)
  {
    zzJN = paramString;
    zzbeN.add(Integer.valueOf(53));
    return this;
  }
  
  public Builder setUrl(String paramString)
  {
    zzF = paramString;
    zzbeN.add(Integer.valueOf(54));
    return this;
  }
  
  public Builder setWidth(String paramString)
  {
    zzbfG = paramString;
    zzbeN.add(Integer.valueOf(55));
    return this;
  }
  
  public Builder setWorstRating(String paramString)
  {
    zzbfH = paramString;
    zzbeN.add(Integer.valueOf(56));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.model.moments.ItemScope.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */