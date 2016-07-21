package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class AppContentTupleEntity
  implements SafeParcelable, AppContentTuple
{
  public static final AppContentTupleEntityCreator CREATOR = new AppContentTupleEntityCreator();
  private final String mName;
  private final String mValue;
  private final int mVersionCode;
  
  AppContentTupleEntity(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    mName = paramString1;
    mValue = paramString2;
  }
  
  public AppContentTupleEntity(AppContentTuple paramAppContentTuple)
  {
    mVersionCode = 1;
    mName = paramAppContentTuple.getName();
    mValue = paramAppContentTuple.getValue();
  }
  
  static int zza(AppContentTuple paramAppContentTuple)
  {
    return zzw.hashCode(new Object[] { paramAppContentTuple.getName(), paramAppContentTuple.getValue() });
  }
  
  static boolean zza(AppContentTuple paramAppContentTuple, Object paramObject)
  {
    if (!(paramObject instanceof AppContentTuple)) {}
    do
    {
      return false;
      if (paramAppContentTuple == paramObject) {
        return true;
      }
      paramObject = (AppContentTuple)paramObject;
    } while ((!zzw.equal(((AppContentTuple)paramObject).getName(), paramAppContentTuple.getName())) || (!zzw.equal(((AppContentTuple)paramObject).getValue(), paramAppContentTuple.getValue())));
    return true;
  }
  
  static String zzb(AppContentTuple paramAppContentTuple)
  {
    return zzw.zzy(paramAppContentTuple).zzg("Name", paramAppContentTuple.getName()).zzg("Value", paramAppContentTuple.getValue()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getValue()
  {
    return mValue;
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
    AppContentTupleEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final AppContentTuple zzwq()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentTupleEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */