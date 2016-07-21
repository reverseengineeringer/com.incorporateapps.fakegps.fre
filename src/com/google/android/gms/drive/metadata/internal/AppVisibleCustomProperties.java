package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties
  implements SafeParcelable, Iterable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public static final AppVisibleCustomProperties zzasK = new AppVisibleCustomProperties.zza().zztA();
  final int mVersionCode;
  final List zzasL;
  
  AppVisibleCustomProperties(int paramInt, Collection paramCollection)
  {
    mVersionCode = paramInt;
    zzx.zzz(paramCollection);
    zzasL = new ArrayList(paramCollection);
  }
  
  private AppVisibleCustomProperties(Collection paramCollection)
  {
    this(1, paramCollection);
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
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      return false;
    }
    return zztz().equals(((AppVisibleCustomProperties)paramObject).zztz());
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzasL });
  }
  
  public final Iterator iterator()
  {
    return zzasL.iterator();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final Map zztz()
  {
    HashMap localHashMap = new HashMap(zzasL.size());
    Iterator localIterator = zzasL.iterator();
    while (localIterator.hasNext())
    {
      CustomProperty localCustomProperty = (CustomProperty)localIterator.next();
      localHashMap.put(localCustomProperty.zztB(), localCustomProperty.getValue());
    }
    return Collections.unmodifiableMap(localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */