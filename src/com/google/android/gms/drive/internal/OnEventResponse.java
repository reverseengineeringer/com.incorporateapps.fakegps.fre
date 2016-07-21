package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class OnEventResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzba();
  final int mVersionCode;
  final int zzanf;
  final ChangeEvent zzasl;
  final CompletionEvent zzasm;
  final QueryResultEventParcelable zzasn;
  final ChangesAvailableEvent zzaso;
  final TransferStateEvent zzasp;
  final TransferProgressEvent zzasq;
  
  OnEventResponse(int paramInt1, int paramInt2, ChangeEvent paramChangeEvent, CompletionEvent paramCompletionEvent, QueryResultEventParcelable paramQueryResultEventParcelable, ChangesAvailableEvent paramChangesAvailableEvent, TransferStateEvent paramTransferStateEvent, TransferProgressEvent paramTransferProgressEvent)
  {
    mVersionCode = paramInt1;
    zzanf = paramInt2;
    zzasl = paramChangeEvent;
    zzasm = paramCompletionEvent;
    zzasn = paramQueryResultEventParcelable;
    zzaso = paramChangesAvailableEvent;
    zzasp = paramTransferStateEvent;
    zzasq = paramTransferProgressEvent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzba.zza(this, paramParcel, paramInt);
  }
  
  public DriveEvent zzts()
  {
    switch (zzanf)
    {
    case 5: 
    case 6: 
    default: 
      throw new IllegalStateException("Unexpected event type " + zzanf);
    case 1: 
      return zzasl;
    case 2: 
      return zzasm;
    case 3: 
      return zzasn;
    case 4: 
      return zzaso;
    case 7: 
      return zzasp;
    }
    return zzasq;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnEventResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */