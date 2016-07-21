package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zznm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MetadataBundle
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  final int mVersionCode;
  final Bundle zzasQ;
  
  MetadataBundle(int paramInt, Bundle paramBundle)
  {
    mVersionCode = paramInt;
    zzasQ = ((Bundle)zzx.zzz(paramBundle));
    zzasQ.setClassLoader(getClass().getClassLoader());
    paramBundle = new ArrayList();
    Object localObject = zzasQ.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (zze.zzdc(str) == null)
      {
        paramBundle.add(str);
        zzz.zzz("MetadataBundle", "Ignored unknown metadata field in bundle: " + str);
      }
    }
    paramBundle = paramBundle.iterator();
    while (paramBundle.hasNext())
    {
      localObject = (String)paramBundle.next();
      zzasQ.remove((String)localObject);
    }
  }
  
  private MetadataBundle(Bundle paramBundle)
  {
    this(1, paramBundle);
  }
  
  public static MetadataBundle zzb(MetadataField paramMetadataField, Object paramObject)
  {
    MetadataBundle localMetadataBundle = zztE();
    localMetadataBundle.zzc(paramMetadataField, paramObject);
    return localMetadataBundle;
  }
  
  public static MetadataBundle zztE()
  {
    return new MetadataBundle(new Bundle());
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof MetadataBundle)) {
      return false;
    }
    paramObject = (MetadataBundle)paramObject;
    Object localObject = zzasQ.keySet();
    if (!((Set)localObject).equals(zzasQ.keySet())) {
      return false;
    }
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!zzw.equal(zzasQ.get(str), zzasQ.get(str))) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = zzasQ.keySet().iterator();
    String str;
    for (int i = 1; localIterator.hasNext(); i = zzasQ.get(str).hashCode() + i * 31) {
      str = (String)localIterator.next();
    }
    return i;
  }
  
  public final void setContext(Context paramContext)
  {
    BitmapTeleporter localBitmapTeleporter = (BitmapTeleporter)zza(zznm.zzatz);
    if (localBitmapTeleporter != null) {
      localBitmapTeleporter.zzc(paramContext.getCacheDir());
    }
  }
  
  public final String toString()
  {
    return "MetadataBundle [values=" + zzasQ + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public final Object zza(MetadataField paramMetadataField)
  {
    return paramMetadataField.zzm(zzasQ);
  }
  
  public final void zzc(MetadataField paramMetadataField, Object paramObject)
  {
    if (zze.zzdc(paramMetadataField.getName()) == null) {
      throw new IllegalArgumentException("Unregistered field: " + paramMetadataField.getName());
    }
    paramMetadataField.zza(paramObject, zzasQ);
  }
  
  public final boolean zzc(MetadataField paramMetadataField)
  {
    return zzasQ.containsKey(paramMetadataField.getName());
  }
  
  public final MetadataBundle zztF()
  {
    return new MetadataBundle(new Bundle(zzasQ));
  }
  
  public final Set zztG()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = zzasQ.keySet().iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(zze.zzdc((String)localIterator.next()));
    }
    return localHashSet;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.MetadataBundle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */