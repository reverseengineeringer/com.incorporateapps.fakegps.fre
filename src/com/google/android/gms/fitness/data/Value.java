package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.zzmy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class Value
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzu();
  private final int mVersionCode;
  private final int zzawZ;
  private float zzaxe;
  private boolean zzaxq;
  private String zzaxr;
  private Map zzaxs;
  private int[] zzaxt;
  private float[] zzaxu;
  private byte[] zzaxv;
  
  public Value(int paramInt)
  {
    this(3, paramInt, false, 0.0F, null, null, null, null, null);
  }
  
  Value(int paramInt1, int paramInt2, boolean paramBoolean, float paramFloat, String paramString, Bundle paramBundle, int[] paramArrayOfInt, float[] paramArrayOfFloat, byte[] paramArrayOfByte)
  {
    mVersionCode = paramInt1;
    zzawZ = paramInt2;
    zzaxq = paramBoolean;
    zzaxe = paramFloat;
    zzaxr = paramString;
    zzaxs = zzv(paramBundle);
    zzaxt = paramArrayOfInt;
    zzaxu = paramArrayOfFloat;
    zzaxv = paramArrayOfByte;
  }
  
  private boolean zza(Value paramValue)
  {
    if ((zzawZ == zzawZ) && (zzaxq == zzaxq))
    {
      switch (zzawZ)
      {
      default: 
        if (zzaxe != zzaxe) {
          break;
        }
      case 1: 
      case 2: 
        do
        {
          do
          {
            return true;
          } while (asInt() == paramValue.asInt());
          return false;
        } while (zzaxe == zzaxe);
        return false;
      case 3: 
        return zzw.equal(zzaxr, zzaxr);
      case 4: 
        return zzw.equal(zzaxs, zzaxs);
      case 5: 
        return Arrays.equals(zzaxt, zzaxt);
      case 6: 
        return Arrays.equals(zzaxu, zzaxu);
      case 7: 
        return Arrays.equals(zzaxv, zzaxv);
      }
      return false;
    }
    return false;
  }
  
  private static Map zzv(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle.setClassLoader(MapValue.class.getClassLoader());
    ArrayMap localArrayMap = new ArrayMap(paramBundle.size());
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayMap.put(str, paramBundle.getParcelable(str));
    }
    return localArrayMap;
  }
  
  public final String asActivity()
  {
    return FitnessActivities.getName(asInt());
  }
  
  public final float asFloat()
  {
    if (zzawZ == 2) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Value is not in float format");
      return zzaxe;
    }
  }
  
  public final int asInt()
  {
    boolean bool = true;
    if (zzawZ == 1) {}
    for (;;)
    {
      zzx.zza(bool, "Value is not in int format");
      return Float.floatToRawIntBits(zzaxe);
      bool = false;
    }
  }
  
  public final String asString()
  {
    if (zzawZ == 3) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Value is not in string format");
      return zzaxr;
    }
  }
  
  public final void clearKey(String paramString)
  {
    if (zzawZ == 4) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
      if (zzaxs != null) {
        zzaxs.remove(paramString);
      }
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof Value)) && (zza((Value)paramObject)));
  }
  
  public final int getFormat()
  {
    return zzawZ;
  }
  
  public final Float getKeyValue(String paramString)
  {
    if (zzawZ == 4) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Value is not in float map format");
      if ((zzaxs == null) || (!zzaxs.containsKey(paramString))) {
        break;
      }
      return Float.valueOf(((MapValue)zzaxs.get(paramString)).asFloat());
    }
    return null;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Float.valueOf(zzaxe), zzaxr, zzaxs, zzaxt, zzaxu, zzaxv });
  }
  
  public final boolean isSet()
  {
    return zzaxq;
  }
  
  public final void setActivity(String paramString)
  {
    setInt(FitnessActivities.zzdm(paramString));
  }
  
  public final void setFloat(float paramFloat)
  {
    if (zzawZ == 2) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
      zzaxq = true;
      zzaxe = paramFloat;
      return;
    }
  }
  
  public final void setInt(int paramInt)
  {
    if (zzawZ == 1) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
      zzaxq = true;
      zzaxe = Float.intBitsToFloat(paramInt);
      return;
    }
  }
  
  public final void setKeyValue(String paramString, float paramFloat)
  {
    if (zzawZ == 4) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
      zzaxq = true;
      if (zzaxs == null) {
        zzaxs = new HashMap();
      }
      zzaxs.put(paramString, MapValue.zzc(paramFloat));
      return;
    }
  }
  
  public final void setString(String paramString)
  {
    if (zzawZ == 3) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
      zzaxq = true;
      zzaxr = paramString;
      return;
    }
  }
  
  public final String toString()
  {
    if (!zzaxq) {
      return "unset";
    }
    switch (zzawZ)
    {
    default: 
      return "unknown";
    case 1: 
      return Integer.toString(asInt());
    case 2: 
      return Float.toString(zzaxe);
    case 3: 
      return zzaxr;
    case 4: 
      return new TreeMap(zzaxs).toString();
    case 5: 
      return Arrays.toString(zzaxt);
    case 6: 
      return Arrays.toString(zzaxu);
    }
    return zzmy.zza(zzaxv, 0, zzaxv.length, false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzu.zza(this, paramParcel, paramInt);
  }
  
  final String zzuA()
  {
    return zzaxr;
  }
  
  final Bundle zzuB()
  {
    if (zzaxs == null) {
      return null;
    }
    Bundle localBundle = new Bundle(zzaxs.size());
    Iterator localIterator = zzaxs.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBundle.putParcelable((String)localEntry.getKey(), (Parcelable)localEntry.getValue());
    }
    return localBundle;
  }
  
  final int[] zzuC()
  {
    return zzaxt;
  }
  
  final float[] zzuD()
  {
    return zzaxu;
  }
  
  final byte[] zzuE()
  {
    return zzaxv;
  }
  
  final float zzuv()
  {
    return zzaxe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Value
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */