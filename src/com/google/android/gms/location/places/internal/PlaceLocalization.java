package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.List;

public final class PlaceLocalization
  implements SafeParcelable
{
  public static final zzo CREATOR = new zzo();
  public final String address;
  public final String name;
  public final int versionCode;
  public final String zzaQO;
  public final String zzaQP;
  public final List zzaQQ;
  
  public PlaceLocalization(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, List paramList)
  {
    versionCode = paramInt;
    name = paramString1;
    address = paramString2;
    zzaQO = paramString3;
    zzaQP = paramString4;
    zzaQQ = paramList;
  }
  
  public static PlaceLocalization zza(String paramString1, String paramString2, String paramString3, String paramString4, List paramList)
  {
    return new PlaceLocalization(0, paramString1, paramString2, paramString3, paramString4, paramList);
  }
  
  public final int describeContents()
  {
    zzo localzzo = CREATOR;
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceLocalization)) {
        return false;
      }
      paramObject = (PlaceLocalization)paramObject;
    } while ((zzw.equal(name, name)) && (zzw.equal(address, address)) && (zzw.equal(zzaQO, zzaQO)) && (zzw.equal(zzaQP, zzaQP)) && (zzw.equal(zzaQQ, zzaQQ)));
    return false;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { name, address, zzaQO, zzaQP });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("name", name).zzg("address", address).zzg("internationalPhoneNumber", zzaQO).zzg("regularOpenHours", zzaQP).zzg("attributions", zzaQQ).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo localzzo = CREATOR;
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceLocalization
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */