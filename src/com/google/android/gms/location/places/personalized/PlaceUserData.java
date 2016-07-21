package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.List;

public class PlaceUserData
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  final int mVersionCode;
  private final String zzVa;
  private final String zzaPH;
  private final List zzaRg;
  
  PlaceUserData(int paramInt, String paramString1, String paramString2, List paramList)
  {
    mVersionCode = paramInt;
    zzVa = paramString1;
    zzaPH = paramString2;
    zzaRg = paramList;
  }
  
  public int describeContents()
  {
    zze localzze = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceUserData)) {
        return false;
      }
      paramObject = (PlaceUserData)paramObject;
    } while ((zzVa.equals(zzVa)) && (zzaPH.equals(zzaPH)) && (zzaRg.equals(zzaRg)));
    return false;
  }
  
  public String getPlaceId()
  {
    return zzaPH;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzVa, zzaPH, zzaRg });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("accountName", zzVa).zzg("placeId", zzaPH).zzg("placeAliases", zzaRg).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze localzze = CREATOR;
    zze.zza(this, paramParcel, paramInt);
  }
  
  public String zzzD()
  {
    return zzVa;
  }
  
  public List zzzE()
  {
    return zzaRg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.personalized.PlaceUserData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */