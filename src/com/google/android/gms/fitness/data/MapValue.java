package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class MapValue
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzm();
  private final int mVersionCode;
  private final int zzawZ;
  private final float zzaxe;
  
  public MapValue(int paramInt, float paramFloat)
  {
    this(1, paramInt, paramFloat);
  }
  
  MapValue(int paramInt1, int paramInt2, float paramFloat)
  {
    mVersionCode = paramInt1;
    zzawZ = paramInt2;
    zzaxe = paramFloat;
  }
  
  private boolean zza(MapValue paramMapValue)
  {
    if (zzawZ == zzawZ)
    {
      switch (zzawZ)
      {
      default: 
        if (zzaxe != zzaxe) {
          break;
        }
      case 2: 
        do
        {
          return true;
        } while (asFloat() == paramMapValue.asFloat());
        return false;
      }
      return false;
    }
    return false;
  }
  
  public static MapValue zzc(float paramFloat)
  {
    return new MapValue(2, paramFloat);
  }
  
  public float asFloat()
  {
    if (zzawZ == 2) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Value is not in float format");
      return zzaxe;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof MapValue)) && (zza((MapValue)paramObject)));
  }
  
  int getFormat()
  {
    return zzawZ;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return (int)zzaxe;
  }
  
  public String toString()
  {
    switch (zzawZ)
    {
    default: 
      return "unknown";
    }
    return Float.toString(asFloat());
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  float zzuv()
  {
    return zzaxe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.MapValue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */