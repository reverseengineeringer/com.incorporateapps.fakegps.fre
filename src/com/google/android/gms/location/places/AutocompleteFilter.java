package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AutocompleteFilter
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  public static final int TYPE_FILTER_ADDRESS = 2;
  public static final int TYPE_FILTER_CITIES = 5;
  public static final int TYPE_FILTER_ESTABLISHMENT = 34;
  public static final int TYPE_FILTER_GEOCODE = 1007;
  public static final int TYPE_FILTER_NONE = 0;
  public static final int TYPE_FILTER_REGIONS = 4;
  final int mVersionCode;
  final boolean zzaPg;
  final List zzaPh;
  final int zzaPi;
  
  AutocompleteFilter(int paramInt, boolean paramBoolean, List paramList)
  {
    mVersionCode = paramInt;
    zzaPh = paramList;
    zzaPi = zzg(paramList);
    if (mVersionCode <= 0)
    {
      if (!paramBoolean) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        zzaPg = paramBoolean;
        return;
      }
    }
    zzaPg = paramBoolean;
  }
  
  public static AutocompleteFilter create(Collection paramCollection)
  {
    return new AutocompleteFilter.Builder().setTypeFilter(zzg(paramCollection)).build();
  }
  
  private static int zzg(Collection paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return 0;
    }
    return ((Integer)paramCollection.iterator().next()).intValue();
  }
  
  private static List zzhJ(int paramInt)
  {
    return Arrays.asList(new Integer[] { Integer.valueOf(paramInt) });
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof AutocompleteFilter)) {
        return false;
      }
      paramObject = (AutocompleteFilter)paramObject;
    } while ((zzaPi == zzaPi) && (zzaPg == zzaPg));
    return false;
  }
  
  public Set getPlaceTypes()
  {
    return new HashSet(zzhJ(zzaPi));
  }
  
  public int getTypeFilter()
  {
    return zzaPi;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Boolean.valueOf(zzaPg), Integer.valueOf(zzaPi) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("includeQueryPredictions", Boolean.valueOf(zzaPg)).zzg("typeFilter", Integer.valueOf(zzaPi)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.AutocompleteFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */