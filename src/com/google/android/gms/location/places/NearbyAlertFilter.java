package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter
  extends zza
  implements SafeParcelable
{
  public static final zzd CREATOR = new zzd();
  final int mVersionCode;
  final List zzaPj;
  final List zzaPk;
  final List zzaPl;
  final String zzaPm;
  final boolean zzaPn;
  private final Set zzaPo;
  private final Set zzaPp;
  private final Set zzaPq;
  
  NearbyAlertFilter(int paramInt, List paramList1, List paramList2, List paramList3, String paramString, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    if (paramList2 == null)
    {
      paramList2 = Collections.emptyList();
      zzaPk = paramList2;
      if (paramList3 != null) {
        break label103;
      }
      paramList2 = Collections.emptyList();
      label31:
      zzaPl = paramList2;
      if (paramList1 != null) {
        break label112;
      }
    }
    label103:
    label112:
    for (paramList1 = Collections.emptyList();; paramList1 = Collections.unmodifiableList(paramList1))
    {
      zzaPj = paramList1;
      zzaPp = zzw(zzaPk);
      zzaPq = zzw(zzaPl);
      zzaPo = zzw(zzaPj);
      zzaPm = paramString;
      zzaPn = paramBoolean;
      return;
      paramList2 = Collections.unmodifiableList(paramList2);
      break;
      paramList2 = Collections.unmodifiableList(paramList3);
      break label31;
    }
  }
  
  public static NearbyAlertFilter zzh(Collection paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
    }
    return new NearbyAlertFilter(0, zzf(paramCollection), null, null, null, false);
  }
  
  public static NearbyAlertFilter zzi(Collection paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
    }
    return new NearbyAlertFilter(0, null, zzf(paramCollection), null, null, false);
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
      if (!(paramObject instanceof NearbyAlertFilter)) {
        return false;
      }
      paramObject = (NearbyAlertFilter)paramObject;
      if ((zzaPm == null) && (zzaPm != null)) {
        return false;
      }
    } while ((zzaPp.equals(zzaPp)) && (zzaPq.equals(zzaPq)) && (zzaPo.equals(zzaPo)) && ((zzaPm == null) || (zzaPm.equals(zzaPm))) && (zzaPn == ((NearbyAlertFilter)paramObject).zzyX()));
    return false;
  }
  
  public final Set getPlaceIds()
  {
    return zzaPo;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaPp, zzaPq, zzaPo, zzaPm, Boolean.valueOf(zzaPn) });
  }
  
  public final String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    if (!zzaPp.isEmpty()) {
      localzza.zzg("types", zzaPp);
    }
    if (!zzaPo.isEmpty()) {
      localzza.zzg("placeIds", zzaPo);
    }
    if (!zzaPq.isEmpty()) {
      localzza.zzg("requestedUserDataTypes", zzaPq);
    }
    if (zzaPm != null) {
      localzza.zzg("chainName", zzaPm);
    }
    localzza.zzg("Beacon required: ", Boolean.valueOf(zzaPn));
    return localzza.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public final boolean zzyX()
  {
    return zzaPn;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.NearbyAlertFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */