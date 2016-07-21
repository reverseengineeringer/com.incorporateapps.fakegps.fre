package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter
  extends zza
  implements SafeParcelable
{
  public static final zzg CREATOR = new zzg();
  private static final PlaceFilter zzaPz = new PlaceFilter();
  final int mVersionCode;
  final boolean zzaPA;
  final List zzaPj;
  final List zzaPk;
  final List zzaPl;
  private final Set zzaPo;
  private final Set zzaPp;
  private final Set zzaPq;
  
  public PlaceFilter()
  {
    this(false, null);
  }
  
  PlaceFilter(int paramInt, List paramList1, boolean paramBoolean, List paramList2, List paramList3)
  {
    mVersionCode = paramInt;
    if (paramList1 == null)
    {
      paramList1 = Collections.emptyList();
      zzaPk = paramList1;
      zzaPA = paramBoolean;
      if (paramList3 != null) {
        break label97;
      }
      paramList1 = Collections.emptyList();
      label36:
      zzaPl = paramList1;
      if (paramList2 != null) {
        break label106;
      }
    }
    label97:
    label106:
    for (paramList1 = Collections.emptyList();; paramList1 = Collections.unmodifiableList(paramList2))
    {
      zzaPj = paramList1;
      zzaPp = zzw(zzaPk);
      zzaPq = zzw(zzaPl);
      zzaPo = zzw(zzaPj);
      return;
      paramList1 = Collections.unmodifiableList(paramList1);
      break;
      paramList1 = Collections.unmodifiableList(paramList3);
      break label36;
    }
  }
  
  public PlaceFilter(Collection paramCollection1, boolean paramBoolean, Collection paramCollection2, Collection paramCollection3)
  {
    this(0, zzf(paramCollection1), paramBoolean, zzf(paramCollection2), zzf(paramCollection3));
  }
  
  public PlaceFilter(boolean paramBoolean, Collection paramCollection)
  {
    this(null, paramBoolean, paramCollection, null);
  }
  
  public static PlaceFilter zzzd()
  {
    return new PlaceFilter.zza(null).zzze();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceFilter)) {
        return false;
      }
      paramObject = (PlaceFilter)paramObject;
    } while ((zzaPp.equals(zzaPp)) && (zzaPA == zzaPA) && (zzaPq.equals(zzaPq)) && (zzaPo.equals(zzaPo)));
    return false;
  }
  
  public final Set getPlaceIds()
  {
    return zzaPo;
  }
  
  public final Set getPlaceTypes()
  {
    return zzaPp;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaPp, Boolean.valueOf(zzaPA), zzaPq, zzaPo });
  }
  
  public final boolean isRestrictedToPlacesOpenNow()
  {
    return zzaPA;
  }
  
  public final String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    if (!zzaPp.isEmpty()) {
      localzza.zzg("types", zzaPp);
    }
    localzza.zzg("requireOpenNow", Boolean.valueOf(zzaPA));
    if (!zzaPo.isEmpty()) {
      localzza.zzg("placeIds", zzaPo);
    }
    if (!zzaPq.isEmpty()) {
      localzza.zzg("requestedUserDataTypes", zzaPq);
    }
    return localzza.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlaceFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */