package com.example.mylibrary

import android.content.Context
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class TEstLib(
    private val context: Context
) {

    private var youtubePlayerView: YouTubePlayerView? = null

    init {
        youtubePlayerView = YouTubePlayerView(context).apply {
            enableBackgroundPlayback(false)
            getPlayerUiController().showUi(false)
            getPlayerUiController().showMenuButton(false)
            getPlayerUiController().showYouTubeButton(false)
        }
    }

    fun getPlayer() = youtubePlayerView

}
