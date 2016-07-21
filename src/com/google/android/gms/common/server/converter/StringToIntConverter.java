package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class StringToIntConverter
  implements SafeParcelable, FastJsonResponse.zza
{
  public static final zzb CREATOR = new zzb();
  private final int mVersionCode;
  private final HashMap zzamG;
  private final HashMap zzamH;
  private final ArrayList zzamI;
  
  public StringToIntConverter()
  {
    mVersionCode = 1;
    zzamG = new HashMap();
    zzamH = new HashMap();
    zzamI = null;
  }
  
  StringToIntConverter(int paramInt, ArrayList paramArrayList)
  {
    mVersionCode = paramInt;
    zzamG = new HashMap();
    zzamH = new HashMap();
    zzamI = null;
    zzd(paramArrayList);
  }
  
  private void zzd(ArrayList paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      StringToIntConverter.Entry localEntry = (StringToIntConverter.Entry)paramArrayList.next();
      zzh(zzamJ, zzamK);
    }
  }
  
  public final int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb localzzb = CREATOR;
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final String zzb(Integer paramInteger)
  {
    String str = (String)zzamH.get(paramInteger);
    paramInteger = str;
    if (str == null)
    {
      paramInteger = str;
      if (zzamG.containsKey("gms_unknown")) {
        paramInteger = "gms_unknown";
      }
    }
    return paramInteger;
  }
  
  public final StringToIntConverter zzh(String paramString, int paramInt)
  {
    zzamG.put(paramString, Integer.valueOf(paramInt));
    zzamH.put(Integer.valueOf(paramInt), paramString);
    return this;
  }
  
  final ArrayList zzri()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzamG.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new StringToIntConverter.Entry(str, ((Integer)zzamG.get(str)).intValue()));
    }
    return localArrayList;
  }
  
  public final int zzrj()
  {
    return 7;
  }
  
  public final int zzrk()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.server.converter.StringToIntConverter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */