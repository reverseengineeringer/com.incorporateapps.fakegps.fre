package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentConditionEntity
  implements SafeParcelable, AppContentCondition
{
  public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
  private final int mVersionCode;
  private final String zzaDJ;
  private final String zzaDK;
  private final String zzaDL;
  private final Bundle zzaDM;
  
  AppContentConditionEntity(int paramInt, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    mVersionCode = paramInt;
    zzaDJ = paramString1;
    zzaDK = paramString2;
    zzaDL = paramString3;
    zzaDM = paramBundle;
  }
  
  public AppContentConditionEntity(AppContentCondition paramAppContentCondition)
  {
    mVersionCode = 1;
    zzaDJ = paramAppContentCondition.zzwf();
    zzaDK = paramAppContentCondition.zzwg();
    zzaDL = paramAppContentCondition.zzwh();
    zzaDM = paramAppContentCondition.zzwi();
  }
  
  static int zza(AppContentCondition paramAppContentCondition)
  {
    return zzw.hashCode(new Object[] { paramAppContentCondition.zzwf(), paramAppContentCondition.zzwg(), paramAppContentCondition.zzwh(), paramAppContentCondition.zzwi() });
  }
  
  static boolean zza(AppContentCondition paramAppContentCondition, Object paramObject)
  {
    if (!(paramObject instanceof AppContentCondition)) {}
    do
    {
      return false;
      if (paramAppContentCondition == paramObject) {
        return true;
      }
      paramObject = (AppContentCondition)paramObject;
    } while ((!zzw.equal(((AppContentCondition)paramObject).zzwf(), paramAppContentCondition.zzwf())) || (!zzw.equal(((AppContentCondition)paramObject).zzwg(), paramAppContentCondition.zzwg())) || (!zzw.equal(((AppContentCondition)paramObject).zzwh(), paramAppContentCondition.zzwh())) || (!zzw.equal(((AppContentCondition)paramObject).zzwi(), paramAppContentCondition.zzwi())));
    return true;
  }
  
  static String zzb(AppContentCondition paramAppContentCondition)
  {
    return zzw.zzy(paramAppContentCondition).zzg("DefaultValue", paramAppContentCondition.zzwf()).zzg("ExpectedValue", paramAppContentCondition.zzwg()).zzg("Predicate", paramAppContentCondition.zzwh()).zzg("PredicateParameters", paramAppContentCondition.zzwi()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
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
    AppContentConditionEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final String zzwf()
  {
    return zzaDJ;
  }
  
  public final String zzwg()
  {
    return zzaDK;
  }
  
  public final String zzwh()
  {
    return zzaDL;
  }
  
  public final Bundle zzwi()
  {
    return zzaDM;
  }
  
  public final AppContentCondition zzwj()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentConditionEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */