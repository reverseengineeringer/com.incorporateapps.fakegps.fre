package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

public class MessageFilter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  public static final MessageFilter INCLUDE_ALL_MY_TYPES = new MessageFilter.Builder().includeAllMyTypes().build();
  final int mVersionCode;
  private final List zzbbB;
  private final List zzbbC;
  private final boolean zzbbD;
  
  MessageFilter(int paramInt, List paramList1, List paramList2, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzbbB = Collections.unmodifiableList((List)zzx.zzz(paramList1));
    zzbbD = paramBoolean;
    paramList1 = paramList2;
    if (paramList2 == null) {
      paramList1 = Collections.emptyList();
    }
    zzbbC = Collections.unmodifiableList(paramList1);
  }
  
  private MessageFilter(List paramList1, List paramList2, boolean paramBoolean)
  {
    this(1, paramList1, paramList2, paramBoolean);
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
      if (!(paramObject instanceof MessageFilter)) {
        return false;
      }
      paramObject = (MessageFilter)paramObject;
    } while ((zzbbD == zzbbD) && (zzw.equal(zzbbB, zzbbB)) && (zzw.equal(zzbbC, zzbbC)));
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbbB, zzbbC, Boolean.valueOf(zzbbD) });
  }
  
  public String toString()
  {
    return "MessageFilter{includeAllMyTypes=" + zzbbD + ", messageTypes=" + zzbbB + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  List zzEo()
  {
    return zzbbB;
  }
  
  boolean zzEp()
  {
    return zzbbD;
  }
  
  List zzEq()
  {
    return zzbbC;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.MessageFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */