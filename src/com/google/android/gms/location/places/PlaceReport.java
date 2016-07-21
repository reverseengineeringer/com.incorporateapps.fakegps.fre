package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;

public class PlaceReport
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  private final String mTag;
  final int mVersionCode;
  private final String zzaPH;
  private final String zzaPI;
  
  PlaceReport(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    mVersionCode = paramInt;
    zzaPH = paramString1;
    mTag = paramString2;
    zzaPI = paramString3;
  }
  
  public static PlaceReport create(String paramString1, String paramString2)
  {
    return zzk(paramString1, paramString2, "unknown");
  }
  
  private static boolean zzel(String paramString)
  {
    boolean bool = true;
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        bool = false;
      }
      return bool;
      if (paramString.equals("unknown"))
      {
        i = 0;
        continue;
        if (paramString.equals("userReported"))
        {
          i = 1;
          continue;
          if (paramString.equals("inferredGeofencing"))
          {
            i = 2;
            continue;
            if (paramString.equals("inferredRadioSignals"))
            {
              i = 3;
              continue;
              if (paramString.equals("inferredReverseGeocoding"))
              {
                i = 4;
                continue;
                if (paramString.equals("inferredSnappedToRoad")) {
                  i = 5;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static PlaceReport zzk(String paramString1, String paramString2, String paramString3)
  {
    zzx.zzz(paramString1);
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    zzx.zzb(zzel(paramString3), "Invalid source");
    return new PlaceReport(1, paramString1, paramString2, paramString3);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlaceReport)) {}
    do
    {
      return false;
      paramObject = (PlaceReport)paramObject;
    } while ((!zzw.equal(zzaPH, zzaPH)) || (!zzw.equal(mTag, mTag)) || (!zzw.equal(zzaPI, zzaPI)));
    return true;
  }
  
  public String getPlaceId()
  {
    return zzaPH;
  }
  
  public String getSource()
  {
    return zzaPI;
  }
  
  public String getTag()
  {
    return mTag;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaPH, mTag, zzaPI });
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    localzza.zzg("placeId", zzaPH);
    localzza.zzg("tag", mTag);
    if (!"unknown".equals(zzaPI)) {
      localzza.zzg("source", zzaPI);
    }
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceReport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */