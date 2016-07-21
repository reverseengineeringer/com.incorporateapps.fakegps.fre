package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetRecentContextCall$Request
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  final int mVersionCode;
  public final Account zzTT;
  public final boolean zzTU;
  public final boolean zzTV;
  public final boolean zzTW;
  public final String zzTX;
  
  public GetRecentContextCall$Request()
  {
    this(null, false, false, false, null);
  }
  
  GetRecentContextCall$Request(int paramInt, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    mVersionCode = paramInt;
    zzTT = paramAccount;
    zzTU = paramBoolean1;
    zzTV = paramBoolean2;
    zzTW = paramBoolean3;
    zzTX = paramString;
  }
  
  public GetRecentContextCall$Request(Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString)
  {
    this(1, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString);
  }
  
  public int describeContents()
  {
    zzf localzzf = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf localzzf = CREATOR;
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.GetRecentContextCall.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */