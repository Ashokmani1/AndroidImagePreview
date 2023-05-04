package com.sampleapps.image_preview

import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator

fun loadImageUsingUrl(imageResource: String): RequestCreator?
{
    return Picasso.get().load(imageResource)
}