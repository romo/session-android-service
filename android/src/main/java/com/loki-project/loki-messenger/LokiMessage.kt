package com.`loki-project`.`loki-messenger`

import nl.komponents.kovenant.Promise
import nl.komponents.kovenant.task

data class LokiMessage(
    /**
     * The hex encoded public key of the receiver.
     */
    val destination: String,
    /**
     * The content of the message.
     */
    val data: String,
    /**
     * The time to live for the message in milliseconds.
     */
    val ttl: Int,
    /**
     * Whether this message is a ping.
     */
    val isPing: Boolean,
    /**
     * When the proof of work was calculated, if applicable (P2P messages don't require proof of work).
     *
     * - Note: Expressed as milliseconds since 00:00:00 UTC on 1 January 1970.
     */
    internal var timestamp: Int? = null,
    /**
     * The base 64 encoded proof of work, if applicable (P2P messages don't require proof of work).
     */
    internal var nonce: String? = null
) {

    companion object {

        fun from(signalMessage: Map<*, *>): LokiMessage? {
            return null
        }
    }

    fun calculatePoW(): Promise<LokiMessage, Exception> {
        return task { throw Exception("not implemented") }
    }

    fun toJSON(): Map<String, Any> {
        return mapOf()
    }
}