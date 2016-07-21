package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class PersonEntity
  extends FastSafeParcelableJsonResponse
  implements Person
{
  public static final zza CREATOR = new zza();
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzF;
  String zzWQ;
  String zzaaL;
  final Set zzbeN;
  String zzbfL;
  PersonEntity.AgeRangeEntity zzbfM;
  String zzbfN;
  String zzbfO;
  int zzbfP;
  PersonEntity.CoverEntity zzbfQ;
  String zzbfR;
  PersonEntity.ImageEntity zzbfS;
  boolean zzbfT;
  PersonEntity.NameEntity zzbfU;
  String zzbfV;
  int zzbfW;
  List zzbfX;
  List zzbfY;
  int zzbfZ;
  int zzbga;
  String zzbgb;
  List zzbgc;
  boolean zzbgd;
  int zztT;
  String zzyv;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzbeM = localHashMap;
    localHashMap.put("aboutMe", FastJsonResponse.Field.zzl("aboutMe", 2));
    zzbeM.put("ageRange", FastJsonResponse.Field.zza("ageRange", 3, PersonEntity.AgeRangeEntity.class));
    zzbeM.put("birthday", FastJsonResponse.Field.zzl("birthday", 4));
    zzbeM.put("braggingRights", FastJsonResponse.Field.zzl("braggingRights", 5));
    zzbeM.put("circledByCount", FastJsonResponse.Field.zzi("circledByCount", 6));
    zzbeM.put("cover", FastJsonResponse.Field.zza("cover", 7, PersonEntity.CoverEntity.class));
    zzbeM.put("currentLocation", FastJsonResponse.Field.zzl("currentLocation", 8));
    zzbeM.put("displayName", FastJsonResponse.Field.zzl("displayName", 9));
    zzbeM.put("gender", FastJsonResponse.Field.zza("gender", 12, new StringToIntConverter().zzh("male", 0).zzh("female", 1).zzh("other", 2), false));
    zzbeM.put("id", FastJsonResponse.Field.zzl("id", 14));
    zzbeM.put("image", FastJsonResponse.Field.zza("image", 15, PersonEntity.ImageEntity.class));
    zzbeM.put("isPlusUser", FastJsonResponse.Field.zzk("isPlusUser", 16));
    zzbeM.put("language", FastJsonResponse.Field.zzl("language", 18));
    zzbeM.put("name", FastJsonResponse.Field.zza("name", 19, PersonEntity.NameEntity.class));
    zzbeM.put("nickname", FastJsonResponse.Field.zzl("nickname", 20));
    zzbeM.put("objectType", FastJsonResponse.Field.zza("objectType", 21, new StringToIntConverter().zzh("person", 0).zzh("page", 1), false));
    zzbeM.put("organizations", FastJsonResponse.Field.zzb("organizations", 22, PersonEntity.OrganizationsEntity.class));
    zzbeM.put("placesLived", FastJsonResponse.Field.zzb("placesLived", 23, PersonEntity.PlacesLivedEntity.class));
    zzbeM.put("plusOneCount", FastJsonResponse.Field.zzi("plusOneCount", 24));
    zzbeM.put("relationshipStatus", FastJsonResponse.Field.zza("relationshipStatus", 25, new StringToIntConverter().zzh("single", 0).zzh("in_a_relationship", 1).zzh("engaged", 2).zzh("married", 3).zzh("its_complicated", 4).zzh("open_relationship", 5).zzh("widowed", 6).zzh("in_domestic_partnership", 7).zzh("in_civil_union", 8), false));
    zzbeM.put("tagline", FastJsonResponse.Field.zzl("tagline", 26));
    zzbeM.put("url", FastJsonResponse.Field.zzl("url", 27));
    zzbeM.put("urls", FastJsonResponse.Field.zzb("urls", 28, PersonEntity.UrlsEntity.class));
    zzbeM.put("verified", FastJsonResponse.Field.zzk("verified", 29));
  }
  
  public PersonEntity()
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
  }
  
  public PersonEntity(String paramString1, String paramString2, PersonEntity.ImageEntity paramImageEntity, int paramInt, String paramString3)
  {
    mVersionCode = 1;
    zzbeN = new HashSet();
    zzWQ = paramString1;
    zzbeN.add(Integer.valueOf(9));
    zzyv = paramString2;
    zzbeN.add(Integer.valueOf(14));
    zzbfS = paramImageEntity;
    zzbeN.add(Integer.valueOf(15));
    zzbfW = paramInt;
    zzbeN.add(Integer.valueOf(21));
    zzF = paramString3;
    zzbeN.add(Integer.valueOf(27));
  }
  
  PersonEntity(Set paramSet, int paramInt1, String paramString1, PersonEntity.AgeRangeEntity paramAgeRangeEntity, String paramString2, String paramString3, int paramInt2, PersonEntity.CoverEntity paramCoverEntity, String paramString4, String paramString5, int paramInt3, String paramString6, PersonEntity.ImageEntity paramImageEntity, boolean paramBoolean1, String paramString7, PersonEntity.NameEntity paramNameEntity, String paramString8, int paramInt4, List paramList1, List paramList2, int paramInt5, int paramInt6, String paramString9, String paramString10, List paramList3, boolean paramBoolean2)
  {
    zzbeN = paramSet;
    mVersionCode = paramInt1;
    zzbfL = paramString1;
    zzbfM = paramAgeRangeEntity;
    zzbfN = paramString2;
    zzbfO = paramString3;
    zzbfP = paramInt2;
    zzbfQ = paramCoverEntity;
    zzbfR = paramString4;
    zzWQ = paramString5;
    zztT = paramInt3;
    zzyv = paramString6;
    zzbfS = paramImageEntity;
    zzbfT = paramBoolean1;
    zzaaL = paramString7;
    zzbfU = paramNameEntity;
    zzbfV = paramString8;
    zzbfW = paramInt4;
    zzbfX = paramList1;
    zzbfY = paramList2;
    zzbfZ = paramInt5;
    zzbga = paramInt6;
    zzbgb = paramString9;
    zzF = paramString10;
    zzbgc = paramList3;
    zzbgd = paramBoolean2;
  }
  
  public static PersonEntity zzv(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = CREATOR.zzgE(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  public final int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PersonEntity)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (PersonEntity)paramObject;
    Iterator localIterator = zzbeM.values().iterator();
    while (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (zza(localField))
      {
        if (((PersonEntity)paramObject).zza(localField))
        {
          if (!zzb(localField).equals(((PersonEntity)paramObject).zzb(localField))) {
            return false;
          }
        }
        else {
          return false;
        }
      }
      else if (((PersonEntity)paramObject).zza(localField)) {
        return false;
      }
    }
    return true;
  }
  
  public final String getAboutMe()
  {
    return zzbfL;
  }
  
  public final Person.AgeRange getAgeRange()
  {
    return zzbfM;
  }
  
  public final String getBirthday()
  {
    return zzbfN;
  }
  
  public final String getBraggingRights()
  {
    return zzbfO;
  }
  
  public final int getCircledByCount()
  {
    return zzbfP;
  }
  
  public final Person.Cover getCover()
  {
    return zzbfQ;
  }
  
  public final String getCurrentLocation()
  {
    return zzbfR;
  }
  
  public final String getDisplayName()
  {
    return zzWQ;
  }
  
  public final int getGender()
  {
    return zztT;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final Person.Image getImage()
  {
    return zzbfS;
  }
  
  public final String getLanguage()
  {
    return zzaaL;
  }
  
  public final Person.Name getName()
  {
    return zzbfU;
  }
  
  public final String getNickname()
  {
    return zzbfV;
  }
  
  public final int getObjectType()
  {
    return zzbfW;
  }
  
  public final List getOrganizations()
  {
    return (ArrayList)zzbfX;
  }
  
  public final List getPlacesLived()
  {
    return (ArrayList)zzbfY;
  }
  
  public final int getPlusOneCount()
  {
    return zzbfZ;
  }
  
  public final int getRelationshipStatus()
  {
    return zzbga;
  }
  
  public final String getTagline()
  {
    return zzbgb;
  }
  
  public final String getUrl()
  {
    return zzF;
  }
  
  public final List getUrls()
  {
    return (ArrayList)zzbgc;
  }
  
  public final boolean hasAboutMe()
  {
    return zzbeN.contains(Integer.valueOf(2));
  }
  
  public final boolean hasAgeRange()
  {
    return zzbeN.contains(Integer.valueOf(3));
  }
  
  public final boolean hasBirthday()
  {
    return zzbeN.contains(Integer.valueOf(4));
  }
  
  public final boolean hasBraggingRights()
  {
    return zzbeN.contains(Integer.valueOf(5));
  }
  
  public final boolean hasCircledByCount()
  {
    return zzbeN.contains(Integer.valueOf(6));
  }
  
  public final boolean hasCover()
  {
    return zzbeN.contains(Integer.valueOf(7));
  }
  
  public final boolean hasCurrentLocation()
  {
    return zzbeN.contains(Integer.valueOf(8));
  }
  
  public final boolean hasDisplayName()
  {
    return zzbeN.contains(Integer.valueOf(9));
  }
  
  public final boolean hasGender()
  {
    return zzbeN.contains(Integer.valueOf(12));
  }
  
  public final boolean hasId()
  {
    return zzbeN.contains(Integer.valueOf(14));
  }
  
  public final boolean hasImage()
  {
    return zzbeN.contains(Integer.valueOf(15));
  }
  
  public final boolean hasIsPlusUser()
  {
    return zzbeN.contains(Integer.valueOf(16));
  }
  
  public final boolean hasLanguage()
  {
    return zzbeN.contains(Integer.valueOf(18));
  }
  
  public final boolean hasName()
  {
    return zzbeN.contains(Integer.valueOf(19));
  }
  
  public final boolean hasNickname()
  {
    return zzbeN.contains(Integer.valueOf(20));
  }
  
  public final boolean hasObjectType()
  {
    return zzbeN.contains(Integer.valueOf(21));
  }
  
  public final boolean hasOrganizations()
  {
    return zzbeN.contains(Integer.valueOf(22));
  }
  
  public final boolean hasPlacesLived()
  {
    return zzbeN.contains(Integer.valueOf(23));
  }
  
  public final boolean hasPlusOneCount()
  {
    return zzbeN.contains(Integer.valueOf(24));
  }
  
  public final boolean hasRelationshipStatus()
  {
    return zzbeN.contains(Integer.valueOf(25));
  }
  
  public final boolean hasTagline()
  {
    return zzbeN.contains(Integer.valueOf(26));
  }
  
  public final boolean hasUrl()
  {
    return zzbeN.contains(Integer.valueOf(27));
  }
  
  public final boolean hasUrls()
  {
    return zzbeN.contains(Integer.valueOf(28));
  }
  
  public final boolean hasVerified()
  {
    return zzbeN.contains(Integer.valueOf(29));
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
  
  public final boolean isPlusUser()
  {
    return zzbfT;
  }
  
  public final boolean isVerified()
  {
    return zzbgd;
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
  
  public final PersonEntity zzFp()
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
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + paramField.zzrs());
    case 2: 
      return zzbfL;
    case 3: 
      return zzbfM;
    case 4: 
      return zzbfN;
    case 5: 
      return zzbfO;
    case 6: 
      return Integer.valueOf(zzbfP);
    case 7: 
      return zzbfQ;
    case 8: 
      return zzbfR;
    case 9: 
      return zzWQ;
    case 12: 
      return Integer.valueOf(zztT);
    case 14: 
      return zzyv;
    case 15: 
      return zzbfS;
    case 16: 
      return Boolean.valueOf(zzbfT);
    case 18: 
      return zzaaL;
    case 19: 
      return zzbfU;
    case 20: 
      return zzbfV;
    case 21: 
      return Integer.valueOf(zzbfW);
    case 22: 
      return zzbfX;
    case 23: 
      return zzbfY;
    case 24: 
      return Integer.valueOf(zzbfZ);
    case 25: 
      return Integer.valueOf(zzbga);
    case 26: 
      return zzbgb;
    case 27: 
      return zzF;
    case 28: 
      return zzbgc;
    }
    return Boolean.valueOf(zzbgd);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.model.people.PersonEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */