package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  final boolean zzarL;
  final LogicalFilter zzatV;
  final String zzatW;
  final SortOrder zzatX;
  final List zzatY;
  final boolean zzatZ;
  
  private Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList1, boolean paramBoolean1, List paramList2, Set paramSet, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzatV = paramLogicalFilter;
    zzatW = paramString;
    zzatX = paramSortOrder;
    zzatY = paramList1;
    zzatZ = paramBoolean1;
    zzapB = paramList2;
    zzapC = paramSet;
    zzarL = paramBoolean2;
  }
  
  Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList1, boolean paramBoolean1, List paramList2, boolean paramBoolean2) {}
  
  private Query(LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList, boolean paramBoolean1, Set paramSet, boolean paramBoolean2) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public Filter getFilter()
  {
    return zzatV;
  }
  
  public String getPageToken()
  {
    return zzatW;
  }
  
  public SortOrder getSortOrder()
  {
    return zzatX;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[] { zzatV, zzatX, zzatW, zzapB });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public List zztJ()
  {
    return zzatY;
  }
  
  public boolean zztK()
  {
    return zzatZ;
  }
  
  public Set zztL()
  {
    return zzapC;
  }
  
  public boolean zztM()
  {
    return zzarL;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.Query
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */