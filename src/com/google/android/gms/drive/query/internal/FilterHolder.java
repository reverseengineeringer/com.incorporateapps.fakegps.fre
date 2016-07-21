package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  final int mVersionCode;
  private final Filter zzapi;
  final ComparisonFilter zzauk;
  final FieldOnlyFilter zzaul;
  final LogicalFilter zzaum;
  final NotFilter zzaun;
  final InFilter zzauo;
  final MatchAllFilter zzaup;
  final HasFilter zzauq;
  final FullTextSearchFilter zzaur;
  final OwnedByMeFilter zzaus;
  
  FilterHolder(int paramInt, ComparisonFilter paramComparisonFilter, FieldOnlyFilter paramFieldOnlyFilter, LogicalFilter paramLogicalFilter, NotFilter paramNotFilter, InFilter paramInFilter, MatchAllFilter paramMatchAllFilter, HasFilter paramHasFilter, FullTextSearchFilter paramFullTextSearchFilter, OwnedByMeFilter paramOwnedByMeFilter)
  {
    mVersionCode = paramInt;
    zzauk = paramComparisonFilter;
    zzaul = paramFieldOnlyFilter;
    zzaum = paramLogicalFilter;
    zzaun = paramNotFilter;
    zzauo = paramInFilter;
    zzaup = paramMatchAllFilter;
    zzauq = paramHasFilter;
    zzaur = paramFullTextSearchFilter;
    zzaus = paramOwnedByMeFilter;
    if (zzauk != null)
    {
      zzapi = zzauk;
      return;
    }
    if (zzaul != null)
    {
      zzapi = zzaul;
      return;
    }
    if (zzaum != null)
    {
      zzapi = zzaum;
      return;
    }
    if (zzaun != null)
    {
      zzapi = zzaun;
      return;
    }
    if (zzauo != null)
    {
      zzapi = zzauo;
      return;
    }
    if (zzaup != null)
    {
      zzapi = zzaup;
      return;
    }
    if (zzauq != null)
    {
      zzapi = zzauq;
      return;
    }
    if (zzaur != null)
    {
      zzapi = zzaur;
      return;
    }
    if (zzaus != null)
    {
      zzapi = zzaus;
      return;
    }
    throw new IllegalArgumentException("At least one filter must be set.");
  }
  
  public FilterHolder(Filter paramFilter)
  {
    zzx.zzb(paramFilter, "Null filter.");
    mVersionCode = 2;
    if ((paramFilter instanceof ComparisonFilter))
    {
      localObject = (ComparisonFilter)paramFilter;
      zzauk = ((ComparisonFilter)localObject);
      if (!(paramFilter instanceof FieldOnlyFilter)) {
        break label247;
      }
      localObject = (FieldOnlyFilter)paramFilter;
      label45:
      zzaul = ((FieldOnlyFilter)localObject);
      if (!(paramFilter instanceof LogicalFilter)) {
        break label252;
      }
      localObject = (LogicalFilter)paramFilter;
      label62:
      zzaum = ((LogicalFilter)localObject);
      if (!(paramFilter instanceof NotFilter)) {
        break label257;
      }
      localObject = (NotFilter)paramFilter;
      label79:
      zzaun = ((NotFilter)localObject);
      if (!(paramFilter instanceof InFilter)) {
        break label262;
      }
      localObject = (InFilter)paramFilter;
      label96:
      zzauo = ((InFilter)localObject);
      if (!(paramFilter instanceof MatchAllFilter)) {
        break label267;
      }
      localObject = (MatchAllFilter)paramFilter;
      label113:
      zzaup = ((MatchAllFilter)localObject);
      if (!(paramFilter instanceof HasFilter)) {
        break label272;
      }
      localObject = (HasFilter)paramFilter;
      label130:
      zzauq = ((HasFilter)localObject);
      if (!(paramFilter instanceof FullTextSearchFilter)) {
        break label277;
      }
      localObject = (FullTextSearchFilter)paramFilter;
      label147:
      zzaur = ((FullTextSearchFilter)localObject);
      if (!(paramFilter instanceof OwnedByMeFilter)) {
        break label282;
      }
    }
    label247:
    label252:
    label257:
    label262:
    label267:
    label272:
    label277:
    label282:
    for (Object localObject = (OwnedByMeFilter)paramFilter;; localObject = null)
    {
      zzaus = ((OwnedByMeFilter)localObject);
      if ((zzauk != null) || (zzaul != null) || (zzaum != null) || (zzaun != null) || (zzauo != null) || (zzaup != null) || (zzauq != null) || (zzaur != null) || (zzaus != null)) {
        break label287;
      }
      throw new IllegalArgumentException("Invalid filter type.");
      localObject = null;
      break;
      localObject = null;
      break label45;
      localObject = null;
      break label62;
      localObject = null;
      break label79;
      localObject = null;
      break label96;
      localObject = null;
      break label113;
      localObject = null;
      break label130;
      localObject = null;
      break label147;
    }
    label287:
    zzapi = paramFilter;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Filter getFilter()
  {
    return zzapi;
  }
  
  public String toString()
  {
    return String.format("FilterHolder[%s]", new Object[] { zzapi });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.internal.FilterHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */