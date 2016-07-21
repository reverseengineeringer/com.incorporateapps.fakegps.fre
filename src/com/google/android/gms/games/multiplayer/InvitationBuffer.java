package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class InvitationBuffer
  extends zzf
{
  public InvitationBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final Invitation zzq(int paramInt1, int paramInt2)
  {
    return new InvitationRef(zzahi, paramInt1, paramInt2);
  }
  
  protected final String zzqg()
  {
    return "external_invitation_id";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */