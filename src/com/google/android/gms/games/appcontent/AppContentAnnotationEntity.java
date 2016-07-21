package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentAnnotationEntity
  implements SafeParcelable, AppContentAnnotation
{
  public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
  private final int mVersionCode;
  private final String zzaDA;
  private final String zzaDB;
  private final int zzaDC;
  private final int zzaDD;
  private final Bundle zzaDE;
  private final Uri zzaDz;
  private final String zzapg;
  private final String zzaxl;
  private final String zzyv;
  
  AppContentAnnotationEntity(int paramInt1, String paramString1, Uri paramUri, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    mVersionCode = paramInt1;
    zzaxl = paramString1;
    zzyv = paramString3;
    zzaDB = paramString5;
    zzaDC = paramInt2;
    zzaDz = paramUri;
    zzaDD = paramInt3;
    zzaDA = paramString4;
    zzaDE = paramBundle;
    zzapg = paramString2;
  }
  
  public AppContentAnnotationEntity(AppContentAnnotation paramAppContentAnnotation)
  {
    mVersionCode = 4;
    zzaxl = paramAppContentAnnotation.getDescription();
    zzyv = paramAppContentAnnotation.getId();
    zzaDB = paramAppContentAnnotation.zzvT();
    zzaDC = paramAppContentAnnotation.zzvU();
    zzaDz = paramAppContentAnnotation.zzvV();
    zzaDD = paramAppContentAnnotation.zzvX();
    zzaDA = paramAppContentAnnotation.zzvY();
    zzaDE = paramAppContentAnnotation.zzvW();
    zzapg = paramAppContentAnnotation.getTitle();
  }
  
  static int zza(AppContentAnnotation paramAppContentAnnotation)
  {
    return zzw.hashCode(new Object[] { paramAppContentAnnotation.getDescription(), paramAppContentAnnotation.getId(), paramAppContentAnnotation.zzvT(), Integer.valueOf(paramAppContentAnnotation.zzvU()), paramAppContentAnnotation.zzvV(), Integer.valueOf(paramAppContentAnnotation.zzvX()), paramAppContentAnnotation.zzvY(), paramAppContentAnnotation.zzvW(), paramAppContentAnnotation.getTitle() });
  }
  
  static boolean zza(AppContentAnnotation paramAppContentAnnotation, Object paramObject)
  {
    if (!(paramObject instanceof AppContentAnnotation)) {}
    do
    {
      return false;
      if (paramAppContentAnnotation == paramObject) {
        return true;
      }
      paramObject = (AppContentAnnotation)paramObject;
    } while ((!zzw.equal(((AppContentAnnotation)paramObject).getDescription(), paramAppContentAnnotation.getDescription())) || (!zzw.equal(((AppContentAnnotation)paramObject).getId(), paramAppContentAnnotation.getId())) || (!zzw.equal(((AppContentAnnotation)paramObject).zzvT(), paramAppContentAnnotation.zzvT())) || (!zzw.equal(Integer.valueOf(((AppContentAnnotation)paramObject).zzvU()), Integer.valueOf(paramAppContentAnnotation.zzvU()))) || (!zzw.equal(((AppContentAnnotation)paramObject).zzvV(), paramAppContentAnnotation.zzvV())) || (!zzw.equal(Integer.valueOf(((AppContentAnnotation)paramObject).zzvX()), Integer.valueOf(paramAppContentAnnotation.zzvX()))) || (!zzw.equal(((AppContentAnnotation)paramObject).zzvY(), paramAppContentAnnotation.zzvY())) || (!zzw.equal(((AppContentAnnotation)paramObject).zzvW(), paramAppContentAnnotation.zzvW())) || (!zzw.equal(((AppContentAnnotation)paramObject).getTitle(), paramAppContentAnnotation.getTitle())));
    return true;
  }
  
  static String zzb(AppContentAnnotation paramAppContentAnnotation)
  {
    return zzw.zzy(paramAppContentAnnotation).zzg("Description", paramAppContentAnnotation.getDescription()).zzg("Id", paramAppContentAnnotation.getId()).zzg("ImageDefaultId", paramAppContentAnnotation.zzvT()).zzg("ImageHeight", Integer.valueOf(paramAppContentAnnotation.zzvU())).zzg("ImageUri", paramAppContentAnnotation.zzvV()).zzg("ImageWidth", Integer.valueOf(paramAppContentAnnotation.zzvX())).zzg("LayoutSlot", paramAppContentAnnotation.zzvY()).zzg("Modifiers", paramAppContentAnnotation.zzvW()).zzg("Title", paramAppContentAnnotation.getTitle()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppContentAnnotationEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final String zzvT()
  {
    return zzaDB;
  }
  
  public final int zzvU()
  {
    return zzaDC;
  }
  
  public final Uri zzvV()
  {
    return zzaDz;
  }
  
  public final Bundle zzvW()
  {
    return zzaDE;
  }
  
  public final int zzvX()
  {
    return zzaDD;
  }
  
  public final String zzvY()
  {
    return zzaDA;
  }
  
  public final AppContentAnnotation zzvZ()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAnnotationEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */