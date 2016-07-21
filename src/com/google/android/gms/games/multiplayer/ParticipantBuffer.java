package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class ParticipantBuffer
  extends AbstractDataBuffer
{
  public final Participant get(int paramInt)
  {
    return new ParticipantRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */