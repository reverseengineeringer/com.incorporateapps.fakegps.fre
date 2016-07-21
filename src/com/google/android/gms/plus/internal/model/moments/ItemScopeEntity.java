package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ItemScopeEntity
  extends FastSafeParcelableJsonResponse
  implements ItemScope
{
  public static final zza CREATOR = new zza();
  private static final HashMap zzbeM;
  String mName;
  final int mVersionCode;
  String zzF;
  String zzJN;
  double zzaNF;
  double zzaNG;
  String zzaxl;
  final Set zzbeN;
  ItemScopeEntity zzbeO;
  List zzbeP;
  ItemScopeEntity zzbeQ;
  String zzbeR;
  String zzbeS;
  String zzbeT;
  List zzbeU;
  int zzbeV;
  List zzbeW;
  ItemScopeEntity zzbeX;
  List zzbeY;
  String zzbeZ;
  String zzbfA;
  String zzbfB;
  String zzbfC;
  ItemScopeEntity zzbfD;
  String zzbfE;
  String zzbfF;
  String zzbfG;
  String zzbfH;
  String zzbfa;
  ItemScopeEntity zzbfb;
  String zzbfc;
  String zzbfd;
  List zzbfe;
  String zzbff;
  String zzbfg;
  String zzbfh;
  String zzbfi;
  String zzbfj;
  String zzbfk;
  String zzbfl;
  String zzbfm;
  ItemScopeEntity zzbfn;
  String zzbfo;
  String zzbfp;
  String zzbfq;
  ItemScopeEntity zzbfr;
  ItemScopeEntity zzbfs;
  ItemScopeEntity zzbft;
  List zzbfu;
  String zzbfv;
  String zzbfw;
  String zzbfx;
  String zzbfy;
  ItemScopeEntity zzbfz;
  String zztZ;
  String zzyv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("about", FastJsonResponse.Field.zza("about", 2, ItemScopeEntity.class));
    zzbeM.put("additionalName", FastJsonResponse.Field.zzm("additionalName", 3));
    zzbeM.put("address", FastJsonResponse.Field.zza("address", 4, ItemScopeEntity.class));
    zzbeM.put("addressCountry", FastJsonResponse.Field.zzl("addressCountry", 5));
    zzbeM.put("addressLocality", FastJsonResponse.Field.zzl("addressLocality", 6));
    zzbeM.put("addressRegion", FastJsonResponse.Field.zzl("addressRegion", 7));
    zzbeM.put("associated_media", FastJsonResponse.Field.zzb("associated_media", 8, ItemScopeEntity.class));
    zzbeM.put("attendeeCount", FastJsonResponse.Field.zzi("attendeeCount", 9));
    zzbeM.put("attendees", FastJsonResponse.Field.zzb("attendees", 10, ItemScopeEntity.class));
    zzbeM.put("audio", FastJsonResponse.Field.zza("audio", 11, ItemScopeEntity.class));
    zzbeM.put("author", FastJsonResponse.Field.zzb("author", 12, ItemScopeEntity.class));
    zzbeM.put("bestRating", FastJsonResponse.Field.zzl("bestRating", 13));
    zzbeM.put("birthDate", FastJsonResponse.Field.zzl("birthDate", 14));
    zzbeM.put("byArtist", FastJsonResponse.Field.zza("byArtist", 15, ItemScopeEntity.class));
    zzbeM.put("caption", FastJsonResponse.Field.zzl("caption", 16));
    zzbeM.put("contentSize", FastJsonResponse.Field.zzl("contentSize", 17));
    zzbeM.put("contentUrl", FastJsonResponse.Field.zzl("contentUrl", 18));
    zzbeM.put("contributor", FastJsonResponse.Field.zzb("contributor", 19, ItemScopeEntity.class));
    zzbeM.put("dateCreated", FastJsonResponse.Field.zzl("dateCreated", 20));
    zzbeM.put("dateModified", FastJsonResponse.Field.zzl("dateModified", 21));
    zzbeM.put("datePublished", FastJsonResponse.Field.zzl("datePublished", 22));
    zzbeM.put("description", FastJsonResponse.Field.zzl("description", 23));
    zzbeM.put("duration", FastJsonResponse.Field.zzl("duration", 24));
    zzbeM.put("embedUrl", FastJsonResponse.Field.zzl("embedUrl", 25));
    zzbeM.put("endDate", FastJsonResponse.Field.zzl("endDate", 26));
    zzbeM.put("familyName", FastJsonResponse.Field.zzl("familyName", 27));
    zzbeM.put("gender", FastJsonResponse.Field.zzl("gender", 28));
    zzbeM.put("geo", FastJsonResponse.Field.zza("geo", 29, ItemScopeEntity.class));
    zzbeM.put("givenName", FastJsonResponse.Field.zzl("givenName", 30));
    zzbeM.put("height", FastJsonResponse.Field.zzl("height", 31));
    zzbeM.put("id", FastJsonResponse.Field.zzl("id", 32));
    zzbeM.put("image", FastJsonResponse.Field.zzl("image", 33));
    zzbeM.put("inAlbum", FastJsonResponse.Field.zza("inAlbum", 34, ItemScopeEntity.class));
    zzbeM.put("latitude", FastJsonResponse.Field.zzj("latitude", 36));
    zzbeM.put("location", FastJsonResponse.Field.zza("location", 37, ItemScopeEntity.class));
    zzbeM.put("longitude", FastJsonResponse.Field.zzj("longitude", 38));
    zzbeM.put("name", FastJsonResponse.Field.zzl("name", 39));
    zzbeM.put("partOfTVSeries", FastJsonResponse.Field.zza("partOfTVSeries", 40, ItemScopeEntity.class));
    zzbeM.put("performers", FastJsonResponse.Field.zzb("performers", 41, ItemScopeEntity.class));
    zzbeM.put("playerType", FastJsonResponse.Field.zzl("playerType", 42));
    zzbeM.put("postOfficeBoxNumber", FastJsonResponse.Field.zzl("postOfficeBoxNumber", 43));
    zzbeM.put("postalCode", FastJsonResponse.Field.zzl("postalCode", 44));
    zzbeM.put("ratingValue", FastJsonResponse.Field.zzl("ratingValue", 45));
    zzbeM.put("reviewRating", FastJsonResponse.Field.zza("reviewRating", 46, ItemScopeEntity.class));
    zzbeM.put("startDate", FastJsonResponse.Field.zzl("startDate", 47));
    zzbeM.put("streetAddress", FastJsonResponse.Field.zzl("streetAddress", 48));
    zzbeM.put("text", FastJsonResponse.Field.zzl("text", 49));
    zzbeM.put("thumbnail", FastJsonResponse.Field.zza("thumbnail", 50, ItemScopeEntity.class));
    zzbeM.put("thumbnailUrl", FastJsonResponse.Field.zzl("thumbnailUrl", 51));
    zzbeM.put("tickerSymbol", FastJsonResponse.Field.zzl("tickerSymbol", 52));
    zzbeM.put("type", FastJsonResponse.Field.zzl("type", 53));
    zzbeM.put("url", FastJsonResponse.Field.zzl("url", 54));
    zzbeM.put("width", FastJsonResponse.Field.zzl("width", 55));
    zzbeM.put("worstRating", FastJsonResponse.Field.zzl("worstRating", 56));
  }
  
  public ItemScopeEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  ItemScopeEntity(Set paramSet, int paramInt1, ItemScopeEntity paramItemScopeEntity1, List paramList1, ItemScopeEntity paramItemScopeEntity2, String paramString1, String paramString2, String paramString3, List paramList2, int paramInt2, List paramList3, ItemScopeEntity paramItemScopeEntity3, List paramList4, String paramString4, String paramString5, ItemScopeEntity paramItemScopeEntity4, String paramString6, String paramString7, String paramString8, List paramList5, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, ItemScopeEntity paramItemScopeEntity5, String paramString18, String paramString19, String paramString20, String paramString21, ItemScopeEntity paramItemScopeEntity6, double paramDouble1, ItemScopeEntity paramItemScopeEntity7, double paramDouble2, String paramString22, ItemScopeEntity paramItemScopeEntity8, List paramList6, String paramString23, String paramString24, String paramString25, String paramString26, ItemScopeEntity paramItemScopeEntity9, String paramString27, String paramString28, String paramString29, ItemScopeEntity paramItemScopeEntity10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbeO = paramItemScopeEntity1;
    zzbeP = paramList1;
    zzbeQ = paramItemScopeEntity2;
    zzbeR = paramString1;
    zzbeS = paramString2;
    zzbeT = paramString3;
    zzbeU = paramList2;
    zzbeV = paramInt2;
    zzbeW = paramList3;
    zzbeX = paramItemScopeEntity3;
    zzbeY = paramList4;
    zzbeZ = paramString4;
    zzbfa = paramString5;
    zzbfb = paramItemScopeEntity4;
    zzbfc = paramString6;
    zzbfd = paramString7;
    zztZ = paramString8;
    zzbfe = paramList5;
    zzbff = paramString9;
    zzbfg = paramString10;
    zzbfh = paramString11;
    zzaxl = paramString12;
    zzbfi = paramString13;
    zzbfj = paramString14;
    zzbfk = paramString15;
    zzbfl = paramString16;
    zzbfm = paramString17;
    zzbfn = paramItemScopeEntity5;
    zzbfo = paramString18;
    zzbfp = paramString19;
    zzyv = paramString20;
    zzbfq = paramString21;
    zzbfr = paramItemScopeEntity6;
    zzaNF = paramDouble1;
    zzbfs = paramItemScopeEntity7;
    zzaNG = paramDouble2;
    mName = paramString22;
    zzbft = paramItemScopeEntity8;
    zzbfu = paramList6;
    zzbfv = paramString23;
    zzbfw = paramString24;
    zzbfx = paramString25;
    zzbfy = paramString26;
    zzbfz = paramItemScopeEntity9;
    zzbfA = paramString27;
    zzbfB = paramString28;
    zzbfC = paramString29;
    zzbfD = paramItemScopeEntity10;
    zzbfE = paramString30;
    zzbfF = paramString31;
    zzJN = paramString32;
    zzF = paramString33;
    zzbfG = paramString34;
    zzbfH = paramString35;
  }
  
  public ItemScopeEntity(Set paramSet, ItemScopeEntity paramItemScopeEntity1, List paramList1, ItemScopeEntity paramItemScopeEntity2, String paramString1, String paramString2, String paramString3, List paramList2, int paramInt, List paramList3, ItemScopeEntity paramItemScopeEntity3, List paramList4, String paramString4, String paramString5, ItemScopeEntity paramItemScopeEntity4, String paramString6, String paramString7, String paramString8, List paramList5, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, ItemScopeEntity paramItemScopeEntity5, String paramString18, String paramString19, String paramString20, String paramString21, ItemScopeEntity paramItemScopeEntity6, double paramDouble1, ItemScopeEntity paramItemScopeEntity7, double paramDouble2, String paramString22, ItemScopeEntity paramItemScopeEntity8, List paramList6, String paramString23, String paramString24, String paramString25, String paramString26, ItemScopeEntity paramItemScopeEntity9, String paramString27, String paramString28, String paramString29, ItemScopeEntity paramItemScopeEntity10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    zzbeN = paramSet;
    mVersionCode = 1;
    zzbeO = paramItemScopeEntity1;
    zzbeP = paramList1;
    zzbeQ = paramItemScopeEntity2;
    zzbeR = paramString1;
    zzbeS = paramString2;
    zzbeT = paramString3;
    zzbeU = paramList2;
    zzbeV = paramInt;
    zzbeW = paramList3;
    zzbeX = paramItemScopeEntity3;
    zzbeY = paramList4;
    zzbeZ = paramString4;
    zzbfa = paramString5;
    zzbfb = paramItemScopeEntity4;
    zzbfc = paramString6;
    zzbfd = paramString7;
    zztZ = paramString8;
    zzbfe = paramList5;
    zzbff = paramString9;
    zzbfg = paramString10;
    zzbfh = paramString11;
    zzaxl = paramString12;
    zzbfi = paramString13;
    zzbfj = paramString14;
    zzbfk = paramString15;
    zzbfl = paramString16;
    zzbfm = paramString17;
    zzbfn = paramItemScopeEntity5;
    zzbfo = paramString18;
    zzbfp = paramString19;
    zzyv = paramString20;
    zzbfq = paramString21;
    zzbfr = paramItemScopeEntity6;
    zzaNF = paramDouble1;
    zzbfs = paramItemScopeEntity7;
    zzaNG = paramDouble2;
    mName = paramString22;
    zzbft = paramItemScopeEntity8;
    zzbfu = paramList6;
    zzbfv = paramString23;
    zzbfw = paramString24;
    zzbfx = paramString25;
    zzbfy = paramString26;
    zzbfz = paramItemScopeEntity9;
    zzbfA = paramString27;
    zzbfB = paramString28;
    zzbfC = paramString29;
    zzbfD = paramItemScopeEntity10;
    zzbfE = paramString30;
    zzbfF = paramString31;
    zzJN = paramString32;
    zzF = paramString33;
    zzbfG = paramString34;
    zzbfH = paramString35;
  }
  
  public final int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ItemScopeEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (ItemScopeEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((ItemScopeEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((ItemScopeEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((ItemScopeEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final ItemScope getAbout()
  {
    return zzbeO;
  }
  
  public final List getAdditionalName()
  {
    return zzbeP;
  }
  
  public final ItemScope getAddress()
  {
    return zzbeQ;
  }
  
  public final String getAddressCountry()
  {
    return zzbeR;
  }
  
  public final String getAddressLocality()
  {
    return zzbeS;
  }
  
  public final String getAddressRegion()
  {
    return zzbeT;
  }
  
  public final List getAssociated_media()
  {
    return (ArrayList)zzbeU;
  }
  
  public final int getAttendeeCount()
  {
    return zzbeV;
  }
  
  public final List getAttendees()
  {
    return (ArrayList)zzbeW;
  }
  
  public final ItemScope getAudio()
  {
    return zzbeX;
  }
  
  public final List getAuthor()
  {
    return (ArrayList)zzbeY;
  }
  
  public final String getBestRating()
  {
    return zzbeZ;
  }
  
  public final String getBirthDate()
  {
    return zzbfa;
  }
  
  public final ItemScope getByArtist()
  {
    return zzbfb;
  }
  
  public final String getCaption()
  {
    return zzbfc;
  }
  
  public final String getContentSize()
  {
    return zzbfd;
  }
  
  public final String getContentUrl()
  {
    return zztZ;
  }
  
  public final List getContributor()
  {
    return (ArrayList)zzbfe;
  }
  
  public final String getDateCreated()
  {
    return zzbff;
  }
  
  public final String getDateModified()
  {
    return zzbfg;
  }
  
  public final String getDatePublished()
  {
    return zzbfh;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final String getDuration()
  {
    return zzbfi;
  }
  
  public final String getEmbedUrl()
  {
    return zzbfj;
  }
  
  public final String getEndDate()
  {
    return zzbfk;
  }
  
  public final String getFamilyName()
  {
    return zzbfl;
  }
  
  public final String getGender()
  {
    return zzbfm;
  }
  
  public final ItemScope getGeo()
  {
    return zzbfn;
  }
  
  public final String getGivenName()
  {
    return zzbfo;
  }
  
  public final String getHeight()
  {
    return zzbfp;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getImage()
  {
    return zzbfq;
  }
  
  public final ItemScope getInAlbum()
  {
    return zzbfr;
  }
  
  public final double getLatitude()
  {
    return zzaNF;
  }
  
  public final ItemScope getLocation()
  {
    return zzbfs;
  }
  
  public final double getLongitude()
  {
    return zzaNG;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final ItemScope getPartOfTVSeries()
  {
    return zzbft;
  }
  
  public final List getPerformers()
  {
    return (ArrayList)zzbfu;
  }
  
  public final String getPlayerType()
  {
    return zzbfv;
  }
  
  public final String getPostOfficeBoxNumber()
  {
    return zzbfw;
  }
  
  public final String getPostalCode()
  {
    return zzbfx;
  }
  
  public final String getRatingValue()
  {
    return zzbfy;
  }
  
  public final ItemScope getReviewRating()
  {
    return zzbfz;
  }
  
  public final String getStartDate()
  {
    return zzbfA;
  }
  
  public final String getStreetAddress()
  {
    return zzbfB;
  }
  
  public final String getText()
  {
    return zzbfC;
  }
  
  public final ItemScope getThumbnail()
  {
    return zzbfD;
  }
  
  public final String getThumbnailUrl()
  {
    return zzbfE;
  }
  
  public final String getTickerSymbol()
  {
    return zzbfF;
  }
  
  public final String getType()
  {
    return zzJN;
  }
  
  public final String getUrl()
  {
    return zzF;
  }
  
  public final String getWidth()
  {
    return zzbfG;
  }
  
  public final String getWorstRating()
  {
    return zzbfH;
  }
  
  public final boolean hasAbout()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasAdditionalName()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasAddress()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final boolean hasAddressCountry()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasAddressLocality()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasAddressRegion()
  {
    return zzbeN.contains(Integer.valueOf(7));
  }
  
  public final boolean hasAssociated_media()
  {
    return zzbeN.contains(Integer.valueOf(8));
  }
  
  public final boolean hasAttendeeCount()
  {
    return zzbeN.contains(Integer.valueOf(9));
  }
  
  public final boolean hasAttendees()
  {
    return zzbeN.contains(Integer.valueOf(10));
  }
  
  public final boolean hasAudio()
  {
    return zzbeN.contains(Integer.valueOf(11));
  }
  
  public final boolean hasAuthor()
  {
    return zzbeN.contains(Integer.valueOf(12));
  }
  
  public final boolean hasBestRating()
  {
    return zzbeN.contains(Integer.valueOf(13));
  }
  
  public final boolean hasBirthDate()
  {
    return zzbeN.contains(Integer.valueOf(14));
  }
  
  public final boolean hasByArtist()
  {
    return zzbeN.contains(Integer.valueOf(15));
  }
  
  public final boolean hasCaption()
  {
    return zzbeN.contains(Integer.valueOf(16));
  }
  
  public final boolean hasContentSize()
  {
    return zzbeN.contains(Integer.valueOf(17));
  }
  
  public final boolean hasContentUrl()
  {
    return zzbeN.contains(Integer.valueOf(18));
  }
  
  public final boolean hasContributor()
  {
    return zzbeN.contains(Integer.valueOf(19));
  }
  
  public final boolean hasDateCreated()
  {
    return zzbeN.contains(Integer.valueOf(20));
  }
  
  public final boolean hasDateModified()
  {
    return zzbeN.contains(Integer.valueOf(21));
  }
  
  public final boolean hasDatePublished()
  {
    return zzbeN.contains(Integer.valueOf(22));
  }
  
  public final boolean hasDescription()
  {
    return zzbeN.contains(Integer.valueOf(23));
  }
  
  public final boolean hasDuration()
  {
    return zzbeN.contains(Integer.valueOf(24));
  }
  
  public final boolean hasEmbedUrl()
  {
    return zzbeN.contains(Integer.valueOf(25));
  }
  
  public final boolean hasEndDate()
  {
    return zzbeN.contains(Integer.valueOf(26));
  }
  
  public final boolean hasFamilyName()
  {
    return zzbeN.contains(Integer.valueOf(27));
  }
  
  public final boolean hasGender()
  {
    return zzbeN.contains(Integer.valueOf(28));
  }
  
  public final boolean hasGeo()
  {
    return zzbeN.contains(Integer.valueOf(29));
  }
  
  public final boolean hasGivenName()
  {
    return zzbeN.contains(Integer.valueOf(30));
  }
  
  public final boolean hasHeight()
  {
    return zzbeN.contains(Integer.valueOf(31));
  }
  
  public final boolean hasId()
  {
    return zzbeN.contains(Integer.valueOf(32));
  }
  
  public final boolean hasImage()
  {
    return zzbeN.contains(Integer.valueOf(33));
  }
  
  public final boolean hasInAlbum()
  {
    return zzbeN.contains(Integer.valueOf(34));
  }
  
  public final boolean hasLatitude()
  {
    return zzbeN.contains(Integer.valueOf(36));
  }
  
  public final boolean hasLocation()
  {
    return zzbeN.contains(Integer.valueOf(37));
  }
  
  public final boolean hasLongitude()
  {
    return zzbeN.contains(Integer.valueOf(38));
  }
  
  public final boolean hasName()
  {
    return zzbeN.contains(Integer.valueOf(39));
  }
  
  public final boolean hasPartOfTVSeries()
  {
    return zzbeN.contains(Integer.valueOf(40));
  }
  
  public final boolean hasPerformers()
  {
    return zzbeN.contains(Integer.valueOf(41));
  }
  
  public final boolean hasPlayerType()
  {
    return zzbeN.contains(Integer.valueOf(42));
  }
  
  public final boolean hasPostOfficeBoxNumber()
  {
    return zzbeN.contains(Integer.valueOf(43));
  }
  
  public final boolean hasPostalCode()
  {
    return zzbeN.contains(Integer.valueOf(44));
  }
  
  public final boolean hasRatingValue()
  {
    return zzbeN.contains(Integer.valueOf(45));
  }
  
  public final boolean hasReviewRating()
  {
    return zzbeN.contains(Integer.valueOf(46));
  }
  
  public final boolean hasStartDate()
  {
    return zzbeN.contains(Integer.valueOf(47));
  }
  
  public final boolean hasStreetAddress()
  {
    return zzbeN.contains(Integer.valueOf(48));
  }
  
  public final boolean hasText()
  {
    return zzbeN.contains(Integer.valueOf(49));
  }
  
  public final boolean hasThumbnail()
  {
    return zzbeN.contains(Integer.valueOf(50));
  }
  
  public final boolean hasThumbnailUrl()
  {
    return zzbeN.contains(Integer.valueOf(51));
  }
  
  public final boolean hasTickerSymbol()
  {
    return zzbeN.contains(Integer.valueOf(52));
  }
  
  public final boolean hasType()
  {
    return zzbeN.contains(Integer.valueOf(53));
  }
  
  public final boolean hasUrl()
  {
    return zzbeN.contains(Integer.valueOf(54));
  }
  
  public final boolean hasWidth()
  {
    return zzbeN.contains(Integer.valueOf(55));
  }
  
  public final boolean hasWorstRating()
  {
    return zzbeN.contains(Integer.valueOf(56));
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzbeM.values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (!zza(localField)) {
        break label68;
      }
      int j = localField.zzrs();
      i = zzb(localField).hashCode() + (i + j);
    }
    label68:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza localzza = CREATOR;
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final HashMap zzFl()
  {
    return zzbeM;
  }
  
  public final ItemScopeEntity zzFm()
  {
    return this;
  }
  
  protected final boolean zza(FastJsonResponse.Field paramField)
  {
    return zzbeN.contains(Integer.valueOf(paramField.zzrs()));
  }
  
  protected final Object zzb(FastJsonResponse.Field paramField)
  {
    switch (paramField.zzrs())
    {
    case 35: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return zzbeO;
    case 3: 
      return zzbeP;
    case 4: 
      return zzbeQ;
    case 5: 
      return zzbeR;
    case 6: 
      return zzbeS;
    case 7: 
      return zzbeT;
    case 8: 
      return zzbeU;
    case 9: 
      return Integer.valueOf(zzbeV);
    case 10: 
      return zzbeW;
    case 11: 
      return zzbeX;
    case 12: 
      return zzbeY;
    case 13: 
      return zzbeZ;
    case 14: 
      return zzbfa;
    case 15: 
      return zzbfb;
    case 16: 
      return zzbfc;
    case 17: 
      return zzbfd;
    case 18: 
      return zztZ;
    case 19: 
      return zzbfe;
    case 20: 
      return zzbff;
    case 21: 
      return zzbfg;
    case 22: 
      return zzbfh;
    case 23: 
      return zzaxl;
    case 24: 
      return zzbfi;
    case 25: 
      return zzbfj;
    case 26: 
      return zzbfk;
    case 27: 
      return zzbfl;
    case 28: 
      return zzbfm;
    case 29: 
      return zzbfn;
    case 30: 
      return zzbfo;
    case 31: 
      return zzbfp;
    case 32: 
      return zzyv;
    case 33: 
      return zzbfq;
    case 34: 
      return zzbfr;
    case 36: 
      return Double.valueOf(zzaNF);
    case 37: 
      return zzbfs;
    case 38: 
      return Double.valueOf(zzaNG);
    case 39: 
      return mName;
    case 40: 
      return zzbft;
    case 41: 
      return zzbfu;
    case 42: 
      return zzbfv;
    case 43: 
      return zzbfw;
    case 44: 
      return zzbfx;
    case 45: 
      return zzbfy;
    case 46: 
      return zzbfz;
    case 47: 
      return zzbfA;
    case 48: 
      return zzbfB;
    case 49: 
      return zzbfC;
    case 50: 
      return zzbfD;
    case 51: 
      return zzbfE;
    case 52: 
      return zzbfF;
    case 53: 
      return zzJN;
    case 54: 
      return zzF;
    case 55: 
      return zzbfG;
    }
    return zzbfH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.moments.ItemScopeEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */