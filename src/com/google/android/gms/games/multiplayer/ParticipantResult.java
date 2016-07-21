package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.internal.constants.MatchResult;

public final class ParticipantResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new ParticipantResultCreator();
  public static final int MATCH_RESULT_DISAGREED = 5;
  public static final int MATCH_RESULT_DISCONNECT = 4;
  public static final int MATCH_RESULT_LOSS = 1;
  public static final int MATCH_RESULT_NONE = 3;
  public static final int MATCH_RESULT_TIE = 2;
  public static final int MATCH_RESULT_UNINITIALIZED = -1;
  public static final int MATCH_RESULT_WIN = 0;
  public static final int PLACING_UNINITIALIZED = -1;
  private final int mVersionCode;
  private final String zzaFa;
  private final int zzaJP;
  private final int zzaJQ;
  
  public ParticipantResult(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzaFa = ((String)zzx.zzz(paramString));
    zzx.zzab(MatchResult.isValid(paramInt2));
    zzaJP = paramInt2;
    zzaJQ = paramInt3;
  }
  
  public ParticipantResult(String paramString, int paramInt1, int paramInt2)
  {
    this(1, paramString, paramInt1, paramInt2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getParticipantId()
  {
    return zzaFa;
  }
  
  public final int getPlacing()
  {
    return zzaJQ;
  }
  
  public final int getResult()
  {
    return zzaJP;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ParticipantResultCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */